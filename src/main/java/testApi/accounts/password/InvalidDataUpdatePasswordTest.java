package testApi.accounts.password;

import entities.User;
import org.testng.annotations.Test;
import testApi.accounts.reg.validDataForRegistration.ValidStaticProvider;
import testApi.base.BaseApiTest;

import java.io.IOException;
import java.util.Map;

import static constants.ApiConstantsURL.accounts.BASE_URL;
import static constants.ApiConstantsURL.accounts.PASSWORD_UPDATE_END_POINT_URL;
import static io.restassured.RestAssured.given;

public class InvalidDataUpdatePasswordTest extends BaseApiTest {


    @Test
    public void verifyErrorMessages_401() throws IOException {

        User userData = User.createUser("Student");
        String password = ValidStaticProvider.getPassword();
        Map<String, String> credentials = Map.of("currentPassword", userData.getPassword(), "newPassword", password, "confirmNewPassword", password);

        given()
                .spec(setUp(credentials))
                .when()
                .put(BASE_URL + PASSWORD_UPDATE_END_POINT_URL)
                .then()
                .statusCode(401)
                .log()
                .status();
    }
}
