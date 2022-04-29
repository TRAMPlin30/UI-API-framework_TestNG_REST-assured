package testApi.accounts.passwordForgot;

import org.testng.annotations.Test;
import testApi.base.BaseApiTest;

import java.util.Map;

import static constants.ApiConstantsURL.accounts.*;
import static io.restassured.RestAssured.given;

public class ValidDataForgotPasswordTest extends BaseApiTest {

    protected Map<String, String> forgotValidData;

    @Test
    public void verifyUserCenSendForgotPassword() {

        forgotValidData = Map.of("email", "linda.jackson@example.com",
                "formUrl", LOCAL_WHAT_FORM_URL);

        given()
                .spec(setUp(forgotValidData))
                .when()
                .post(BASE_URL + PASSWORD_FORGOT_END_POINT_URL)
                .then()
                .statusCode(200);

    }
}
