package testApi.students;

import com.fasterxml.jackson.core.JsonProcessingException;
import entities.apiEntities.Student;
import io.restassured.response.Response;
import org.assertj.core.util.Arrays;
import org.testng.Assert;
import org.testng.annotations.Test;
import testApi.base.BaseApiTest;
import testApi.students.InvalidStaticProvider;

import static constants.ApiConstantsURL.accounts.STUDENTS_END_POINT_URL;
import static constants.Messages.AlertMessages.*;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class StudentsAddInvalidParameterTest extends BaseApiTest {


    private List getListOfStudents() throws JsonProcessingException {
        List studentsList = Arrays.asList(given()
                .spec(login("Admin"))
                .when()
                .get("/api/v2/students")
                .then()
                .extract()
                .body()
                .jsonPath().getList("", Student.class).toArray());
        return studentsList;
    }

    @Test (dataProviderClass = InvalidStaticProvider.class, dataProvider = "invalidDataFirstName")

    public void updateStudentInvalidDate(String invalidDataFirstName ) throws JsonProcessingException {
        Map <String, String> data = Map.of("firstName",invalidDataFirstName);
        int studentId = ((Student) getListOfStudents().get(0)).getId();
        Response response = given()
                .spec(login("Admin"))
                .body(data)
                .when()
                .pathParam("studentId", studentId)
                .put(STUDENTS_END_POINT_URL)
                .then()
                .extract()
                .response();

         Assert.assertEquals(response.getBody().jsonPath().get("error.message"), MESSAGE_ALERT_CHARACTERS);
         Assert.assertEquals(response.getStatusCode(), 400);

    }

    @Test (dataProviderClass = InvalidStaticProvider.class, dataProvider="invalidData")

    public void updateStudentInvalidEmail(String invalidDataEmail) throws JsonProcessingException {
        Map <String, String> data = Map.of("email",invalidDataEmail);
        int studentId = ((Student) getListOfStudents().get(0)).getId();
        Response response = given()
                .spec(login("Admin"))
                .body(data)
                .when()
                .pathParam("studentId", studentId)
                .put(STUDENTS_END_POINT_URL)
                .then()
                .extract()
                .response();


        Assert.assertEquals(response.getBody().jsonPath().get("error.message"), MESSAGE_ALERT_INCORRECT_EMAIL);
        Assert.assertEquals(response.getStatusCode(), 400);


    }
}