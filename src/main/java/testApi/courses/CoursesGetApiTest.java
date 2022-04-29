package testApi.courses;

import org.testng.annotations.Test;
import testApi.base.BaseApiTest;

import static constants.ApiConstantsURL.courses.*;
import static io.restassured.RestAssured.given;

public class CoursesGetApiTest extends BaseApiTest {

    @Test
    public void getListOfCourses() {
       given()
                .spec(login("Admin"))
                .when()
                .get(COURSE_END_POINT_URL)
                .then()
                .statusCode(200);
    }
}
