package testApi.assignment;

import entities.RegisteredUser;
import entities.apiEntities.UnassignedUsersApi;
import entities.apiEntities.ValidRegistrationData;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import testApi.base.BaseApiTest;

import java.util.List;

import static constants.ApiConstantsURL.accounts.*;
import static constants.ApiConstantsURL.unassignedUsers.ASSIGNED_UNASSIGNED_USER_TO_SECRETARY_ROLE;
import static constants.Messages.UnassignedUsers.MESSAGE_ACCOUNT_IS_NOT_FOUND;
import static constants.Messages.UnassignedUsers.MESSAGE_ALERT_ACCOUNT_IS_ASSIGNED;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

public class InvalidUnassignedUsersApiTest extends BaseApiTest {

    public static ValidRegistrationData validRegistrationData = new ValidRegistrationData();
    public static RegisteredUser registeredUser = null;

    private static RegisteredUser registration() {
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
    public void verifyAssignAccountToAssignedUser() {
        int accountId = registration().getId();
        given()
                .spec(login("Admin"))
                .when()
                .post(ASSIGNED_UNASSIGNED_USER_TO_SECRETARY_ROLE, accountId)
                .then()
                .assertThat()
                .statusCode(200);

        Response responseBody = given()
                .spec(login("Admin"))
                .contentType(ContentType.JSON)
                .body(UnassignedUsersApi
                        .builder()
                        .id(accountId)
                        .requestCode(0)
                        .requestError(MESSAGE_ALERT_ACCOUNT_IS_ASSIGNED)
                        .build())
                .log()
                .all()
                .when()
                .post(ASSIGNED_UNASSIGNED_USER_TO_SECRETARY_ROLE, accountId);
        assertThat(responseBody.getBody().jsonPath().get("error.message").toString()).contains(MESSAGE_ALERT_ACCOUNT_IS_ASSIGNED);
        assertThat(responseBody.getStatusCode()).isEqualTo(400);
    }

    @Test
    public void verifyAssignAccountToUnregisteredUser() {
        int lastUserId = 0;
        List<Integer> usersId = given()
                .spec(login("Admin"))
                .when()
                .get(ACCOUNTS_LIST_END_POINT_URL)
                .then()
                .extract()
                .jsonPath().getList("id");

        for (int i = 0; i < usersId.size(); i++) {
            lastUserId = usersId.get(usersId.size() - 1);
        }
        Response responseBody = given()
                .spec(login("Admin"))
                .contentType(ContentType.JSON)
                .body(UnassignedUsersApi
                        .builder()
                        .id(lastUserId + 1)
                        .requestCode(3)
                        .requestError(MESSAGE_ACCOUNT_IS_NOT_FOUND)
                        .build())
                .log()
                .all()
                .when()
                .pathParam("accountId", lastUserId + 1)
                .post(ASSIGNED_UNASSIGNED_USER_TO_SECRETARY_ROLE);
        assertThat(responseBody.getBody().jsonPath().get("error.message").toString()).contains(MESSAGE_ACCOUNT_IS_NOT_FOUND);
        assertThat(responseBody.getStatusCode()).isEqualTo(404);
    }
}
