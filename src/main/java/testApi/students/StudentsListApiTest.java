package testApi.students;

import com.fasterxml.jackson.core.JsonProcessingException;
import entities.apiEntities.Student;
import org.assertj.core.util.Arrays;
import org.testng.annotations.Test;
import testApi.base.BaseApiTest;

import static constants.ApiConstantsURL.accounts.*;
import static org.hamcrest.core.IsEqual.equalTo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class StudentsListApiTest extends BaseApiTest {



    private List getListOfStudents() throws JsonProcessingException {
        List studentsList = Arrays.asList(given()
                .spec(login("Admin"))
                .when()
                .get(STUDENTS_END_POINT_URL_ACTIVE)
                .then()
                .extract()
                .body()
                .jsonPath().getList("", Student.class).toArray());
        return studentsList;
    }


    @Test

    public void updateStudentDate() throws JsonProcessingException {
        Map<String, String> mapChanges = new HashMap<>();

        int studentId =((Student) getListOfStudents().get(0)).getId();
        mapChanges.put("email", "david.brown@example.com");
        mapChanges.put("firstName", "David");
        mapChanges.put("lastName", "Brown");
        given()
                .spec(login("Admin"))
                .body(mapChanges)
                .when()
                .pathParam("studentId", studentId)
                .put(STUDENTS_END_POINT_URL)
                .then()
                .assertThat()
                .statusCode(200)
                .and()
                .body("firstName", equalTo(mapChanges.get("firstName")))
                .and()
                .body ("lastName", equalTo(mapChanges.get("lastName")))
                .and()
                .body ("email", equalTo (mapChanges.get("email")))
                .log().body();
    }

     @Test
    public void verifyStudentPresentInStudentsList() throws JsonProcessingException {
         int studentId =((Student) getListOfStudents().get(0)).getId();
        given()
                .spec(login("Admin"))
                .when()
                .get(STUDENTS_END_POINT_URL_ALL)
                .then()
                .statusCode(200)
                .extract()
                .body()
                .jsonPath()
                .prettyPrint();
        assert given()
                .spec(login("Admin"))
                .when()
                .get(STUDENTS_END_POINT_URL_ALL)
                .then()
                .extract()
                .jsonPath()
                .getList("id")
                .contains(studentId);



    }
    }




