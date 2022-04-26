package testApi.accounts.password;

import entities.User;
import org.testng.annotations.Test;
import testApi.accounts.reg.validDataForRegistration.ValidStaticProvider;
import testApi.base.BaseApiTest;

import java.io.IOException;
import java.util.Map;

import static constants.ApiConstantsURL.accounts.*;
import static io.restassured.RestAssured.given;

public class ValidDataUpdatePasswordTest extends BaseApiTest {

    String role = "Student";
    User userData = User.createUser(role);

    @Test
    public void verifyUserCanUpdatePassword() throws IOException {

        String currentEmail = userData.getEmail();
        String currentPassword = userData.getPassword();
        String newPassword = ValidStaticProvider.getPassword();

        Map<String, String> newCredentials = Map.of("currentPassword", currentPassword, "newPassword", newPassword, "confirmNewPassword", newPassword);

        given()
                .spec(login(role))
                .body(newCredentials)
                .when()
                .put(BASE_URL + PASSWORD_UPDATE_END_POINT_URL)
                .then()
                .statusCode(200)
                .log()
                .all();
        
        Map<String, String> newUser = Map.of("email", currentEmail, "password", newPassword);
        Map<String, String> returnCredentials = Map.of("currentPassword", newPassword, "newPassword", currentPassword, "confirmNewPassword", currentPassword);

        String token = given()
                        .spec(setUp(newUser))
                        .when()
                        .post(BASE_URL + AUTH_END_POINT_URL)
                        .then()
                        .statusCode(200)
                        .extract()
                        .response()
                        .header("authorization");
        given()
                .spec(loginReturnPassword(token))
                .when()
                .body(returnCredentials)
                .put(BASE_URL + PASSWORD_UPDATE_END_POINT_URL)
                .then()
                .statusCode(200)
                .log()
                .all();
    }
}
