package testApi.accounts.reg;

import entities.RegisteredUser;
import entities.apiEntities.ValidRegistrationData;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import testApi.base.BaseApiTest;

import static constants.ApiConstantsURL.accounts.*;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ValidDataUsersRegistrationApiTest extends BaseApiTest {

    public static ValidRegistrationData validRegistrationData = new ValidRegistrationData();
    public static RegisteredUser registeredUser = null;

    @Test(description = "registration with invalid data")
    public void verifyPossibilityRegistration() {

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

        assertThat(validRegistrationData.getFirstName()).contains(registeredUser.getFirstName());
        assertThat(validRegistrationData.getLastName()).contains(registeredUser.getLastName());
        assertThat(validRegistrationData.getEmail()).contains(registeredUser.getEmail());

    }
}
