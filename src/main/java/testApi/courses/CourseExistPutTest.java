package testApi.courses;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import testApi.base.BaseApiTest;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static constants.ApiConstantsURL.courses.*;
import static io.restassured.RestAssured.given;
import static net.andreinc.mockneat.unit.user.Names.names;

public class CourseExistPutTest extends BaseApiTest {

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
        String name = responseCourseName.jsonPath().getString("name");
        System.out.println(responseCourseName.body().asPrettyString());

        given()
                .spec(login("Admin"))
                .body(mapCourseName)
                .when()
                .pathParams("id", id)
                .put(COURSE_ID_END_POINT_URL)
                .then()
                .assertThat()
                .log().body()
                .statusCode(422)
                .and()
                .extract().body().jsonPath().get("error.message")
                .toString().contains("Сourse name " + name + "is already taken");
    }
}
