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
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CoursePostApiTest extends BaseApiTest {

    private static String getCourseName() throws IOException {
        List<String> courses = names().append(" courses").list(1).get();
        String courseName;
        courseName = courses.get(0);
        return courseName;
    }

    @Test
    public void getCourseMessage() throws IOException {
        Map<String, String> mapCourseName = new HashMap<>();
        mapCourseName.put("name", getCourseName());

        Response responseCourseName =
                given()
                .spec(login("Admin"))
                .body(mapCourseName)
                .post(COURSE_END_POINT_URL);
        String id = responseCourseName.jsonPath().getString("id");
        System.out.println(responseCourseName.body().asPrettyString());

        assertThat(responseCourseName.getBody().jsonPath().get("id").toString()).contains(id);
        assertThat(responseCourseName.getBody().jsonPath().get("name").toString()).contains(mapCourseName.get("name"));
        assertThat(responseCourseName.getBody().jsonPath().get("isActive").toString()).contains("true");
    }
}


