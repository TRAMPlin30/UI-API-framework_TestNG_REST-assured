package testApi.courses;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import testApi.base.BaseApiTest;
import testApi.courses.DataProvider.InvalidStaticPutProvider;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static constants.ApiConstantsURL.courses.*;
import static io.restassured.RestAssured.given;
import static net.andreinc.mockneat.unit.user.Names.names;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CourseInvalidPutTest extends BaseApiTest {

    private static String getCourseName() throws IOException {
        List<String> courses = names().append(" courses").list(1).get();
        String courseName;
        courseName = courses.get(0);
        return courseName;
    }

    private String getIdCourse() throws IOException {
        Map<String, String> mapCourseName = new HashMap<>();
        mapCourseName.put("name", getCourseName());

        Response responseCourseName =
                given()
                        .spec(login("Admin"))
                        .body(mapCourseName)
                        .post(COURSE_END_POINT_URL);
        String id = responseCourseName.jsonPath().getString("id");
        System.out.println(responseCourseName.body().asPrettyString());
        return id;
    }

    @Test (dataProviderClass = InvalidStaticPutProvider.class, dataProvider = "invalidData")
            public void putInvalidName(String invalidData, String errorMessage) throws IOException {
        Map <String, String> data = Map.of("name", invalidData);
        Response responseInvalid = given()
                .spec(login("Admin"))
                .body(data)
                .when()
                .pathParams("id", getIdCourse())
                .put(COURSE_ID_END_POINT_URL);

        assertThat(responseInvalid.getStatusCode()).isEqualTo(400);
        assertThat(responseInvalid.getBody().jsonPath().get("error.message").toString()).contains(errorMessage);
    }
}
