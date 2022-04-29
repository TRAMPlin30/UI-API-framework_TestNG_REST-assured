package testApi.accounts.passwordForgot;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import testApi.base.BaseApiTest;

import java.util.Map;

import static constants.ApiConstantsURL.accounts.*;
import static constants.Messages.AlertMessages.MESSAGE_ALERT_INCORRECT_EMAIL;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class InvalidDataForgotPasswordTest extends BaseApiTest {

    @Test (description = "errors in email")
    public void verifyErrorMassage_400 (){

        Map<String, String> forgotInvalidData = Map.of("email", "@gmail.com",
                                                       "formUrl", LOCAL_WHAT_FORM_URL);

        Response response = given()
                .spec(setUp(forgotInvalidData))
                .when()
                .post(BASE_URL + PASSWORD_FORGOT_END_POINT_URL);

        assertThat(response.getStatusCode()).isEqualTo(400);
        assertThat(response.getBody().jsonPath().get("error.message").toString()).contains(MESSAGE_ALERT_INCORRECT_EMAIL);
    }

    @Test (description = "user not registered")
    public void verifyErrorMassage_404 (){

        Map<String, String> forgotInvalidData = Map.of("email", "exampleee1@gmail.com",
                "formUrl", LOCAL_WHAT_FORM_URL);

        Response response = given()
                .spec(setUp(forgotInvalidData))
                .when()
                .post(BASE_URL + PASSWORD_FORGOT_END_POINT_URL);

        assertThat(response.getStatusCode()).isEqualTo(404);
        assertThat(response.getBody().jsonPath().get("error.message").toString()).contains("Account with email "+forgotInvalidData.get("email")+" does not exist!");
    }
}
