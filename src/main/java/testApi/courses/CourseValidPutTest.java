package testApi.courses;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import testApi.base.BaseApiTest;
import testApi.courses.DataProvider.ValidStaticPutProvider;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static constants.ApiConstantsURL.courses.*;
import static io.restassured.RestAssured.given;
import static net.andreinc.mockneat.unit.user.Names.names;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CourseValidPutTest extends BaseApiTest {

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
        return id;
    }

    @Test (dataProviderClass = ValidStaticPutProvider.class, dataProvider = "validData")
    public void putValidName(String ValidData) throws IOException {
        Map <String, String> data = Map.of("name", ValidData);
        Response responseValid = given()
                .spec(login("Admin"))
                .body(data)
                .when()
                .pathParams("id", getIdCourse())
                .log().all()
                .put(COURSE_ID_END_POINT_URL);

        assertThat(responseValid.getStatusCode()).isEqualTo(200);
        assertThat(responseValid.getBody().jsonPath().get("name").toString()).contains(data.get("name"));
        assertThat(responseValid.getBody().jsonPath().get("isActive").toString()).contains("true");
    }
}
