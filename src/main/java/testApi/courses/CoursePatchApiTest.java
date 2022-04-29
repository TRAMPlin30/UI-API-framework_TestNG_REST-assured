package testApi.courses;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import testApi.base.BaseApiTest;
import testApi.courses.DataProvider.InvalidStaticPutProvider;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static constants.ApiConstantsURL.courses.COURSE_END_POINT_URL;
import static constants.ApiConstantsURL.courses.COURSE_ID_END_POINT_URL;
import static io.restassured.RestAssured.given;
import static net.andreinc.mockneat.unit.user.Names.names;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CoursePatchApiTest extends BaseApiTest {

    private static String getCourseName() throws IOException {
        List<String> courses = names().append(" courses").list(1).get();
        String courseName;
        courseName = courses.get(0);
        return courseName;
    }

    @Test
    public void putExistCourseName() throws IOException {
        Map<String, String> mapCourseName = new HashMap<>();
        mapCourseName.put("name", getCourseName());

        Response responseCourseName =
                given()
                        .spec(login("Admin"))
                        .body(mapCourseName)
                        .post(COURSE_END_POINT_URL);
        String id = responseCourseName.jsonPath().getString("id");

        given()
                .spec(login("Admin"))
                .body(mapCourseName)
                .when()
                .pathParams("id", id)
                .patch(COURSE_ID_END_POINT_URL)
                .then()
                .statusCode(409)
                .and()
                .extract().body().jsonPath().get("error.message")
                .toString().contains("Course is already active.");

        assertThat(responseCourseName.getBody().jsonPath().get("isActive").toString()).contains("true");
    }
}
