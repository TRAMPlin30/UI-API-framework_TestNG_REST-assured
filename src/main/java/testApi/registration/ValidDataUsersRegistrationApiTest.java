package testApi.registration;

import entities.RegisteredUser;
import entities.ValidRegistrationData;
import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;
import testApi.base.BaseApiTest;

import static constants.ApiConstantsURL.accounts.*;
import static io.restassured.RestAssured.given;

public class ValidDataUsersRegistrationApiTest extends BaseApiTest {

    public static ValidRegistrationData validRegistrationData = new ValidRegistrationData();
    public static RegisteredUser registeredUser = null;

    @Test(description = "registration")
    public void verifyPossibilityRegistration() {

        registeredUser = given()
                .contentType(ContentType.JSON)
                .body(validRegistrationData)
                .log().method().and().log().uri()
                .when()
                .post(BASE_URL + REG_POINT_URL)
                .then()
                .assertThat()
                .statusCode(200)
                .log().body().and().log().status()
                .extract()
                .as(RegisteredUser.class);

        Assert.assertEquals(validRegistrationData.getFirstName(), registeredUser.getFirstName());
        Assert.assertEquals(validRegistrationData.getLastName(), registeredUser.getLastName());
        Assert.assertEquals(validRegistrationData.getEmail(), registeredUser.getEmail());

    }
}
