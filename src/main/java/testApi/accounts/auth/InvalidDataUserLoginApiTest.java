package testApi.accounts.auth;

import entities.RegisteredUser;
import entities.apiEntities.ValidRegistrationData;
import entities.apiEntities.BadRequestApi;
import entities.apiEntities.InvalidLoginDataApi;
import org.testng.annotations.Test;
import testApi.accounts.auth.invalidDataForLogin.InvalidStaticProviderApi;
import testApi.base.BaseApiTest;

import java.util.Map;

import static constants.ApiConstantsURL.accounts.*;
import static constants.Messages.AlertMessages.*;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class InvalidDataUserLoginApiTest extends BaseApiTest {

    @Test  (dataProviderClass = InvalidStaticProviderApi.class, dataProvider = "invalidData_400",
            description = "Impossible to log in")
    public void verifyErrorMessages_400(InvalidLoginDataApi invalidData) {

        BadRequestApi badRequest = given()
                .spec(setUp(invalidData))
                .when()
                .post(BASE_URL + AUTH_END_POINT_URL)
                .then()
                .statusCode(400)
                .extract()
                .body()
                .as(BadRequestApi.class);

        assertThat(badRequest.getError().code).isEqualTo(invalidData.getErrorCode());
        assertThat(badRequest.getError().message).isEqualTo(invalidData.getErrorMessage());

    }


    @Test  (dataProviderClass = InvalidStaticProviderApi.class, dataProvider = "invalidData_401",
            description = "Account is not active")
    public void verifyErrorMessages_401(String email, String password) {

        Map<String, String> data = Map.of("email", email, "password", password);

              String response = given()
                .spec(setUp(data))
                .when()
                .post(BASE_URL + AUTH_END_POINT_URL)
                .then()
                .statusCode(401)
                .extract()
                .body()
                .asString();

        assertThat(response).isEqualTo(MESSAGE_UNAUTHORIZED_401);
    }


    ValidRegistrationData validRegistrationData = new ValidRegistrationData();
    RegisteredUser registeredUser = null;

    @Test  (description = "Account not approved")
    public void verifyErrorMessages_403() {
        String password = validRegistrationData.getPassword();
        registeredUser = given()
                .spec(setUp(validRegistrationData))
                .when()
                .post(BASE_URL + REG_END_POINT_URL)
                .then()
                .assertThat()
                .statusCode(200)
                .log().body().and().log().status()
                .extract()
                .as(RegisteredUser.class);

        Map<String, String> unassignedUser = Map.of("email", registeredUser.getEmail(), "password", password);

        String response = given()
                .spec(setUp(unassignedUser))
                .when()
                .post(BASE_URL + AUTH_END_POINT_URL)
                .then()
                .statusCode(403)
                .extract()
                .body()
                .asString();

        assertThat(response).contains(unassignedUser.get("email") + MESSAGE_UNAUTHORIZED_403);
    }
}
