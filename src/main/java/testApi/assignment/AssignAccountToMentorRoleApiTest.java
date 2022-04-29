package testApi.assignment;

import entities.RegisteredUser;
import entities.apiEntities.ValidRegistrationData;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testApi.base.BaseApiTest;

import java.util.List;

import static constants.ApiConstantsURL.accounts.BASE_URL;
import static constants.ApiConstantsURL.accounts.REG_END_POINT_URL;
import static constants.ApiConstantsURL.unassignedUsers.ASSIGNED_UNASSIGNED_USER_TO_MENTOR_ROLE;
import static constants.ApiConstantsURL.mentors.LIST_OF_MENTORS_END_POINT_URL;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

public class AssignAccountToMentorRoleApiTest extends BaseApiTest {

    public static ValidRegistrationData validRegistrationData = new ValidRegistrationData();
    public static RegisteredUser registeredUser = null;

    @BeforeMethod
    public static RegisteredUser registration() {
        registeredUser = given()
                .contentType(ContentType.JSON)
                .body(validRegistrationData)
                .log().method().and().log().uri()
                .when()
                .post(BASE_URL + REG_END_POINT_URL)
                .then()
                .assertThat()
                .statusCode(200)
                .log().body().and().log().status()
                .extract().as(RegisteredUser.class);
        return registeredUser;
    }

    @Test
    public void verifyAssignAccountToMentor() {
        int accountId = registeredUser.getId();
        String accountLastName = registeredUser.getLastName();
        given()
                .spec(login("Admin"))
                .when()
                .post(ASSIGNED_UNASSIGNED_USER_TO_MENTOR_ROLE, accountId)
                .then()
                .assertThat()
                .statusCode(200);

        List<String> mentorsUsersLastNames = given()
                .spec(login("Admin"))
                .when()
                .get(LIST_OF_MENTORS_END_POINT_URL)
                .then()
                .extract().jsonPath().getList("lastName");
        assertThat(mentorsUsersLastNames.contains(accountLastName));
    }
}
