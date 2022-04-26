package testApi.accounts.reg;

import entities.apiEntities.InvalidRegistrationData;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import testApi.accounts.reg.invalidDataForRegistration.InvalidStaticProvider;
import testApi.base.BaseApiTest;

import static constants.ApiConstantsURL.accounts.*;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class InvalidDataUsersRegistrationApiTest extends BaseApiTest {

    @Test(dataProviderClass = InvalidStaticProvider.class, dataProvider = "invalidData",
            description = "registration with invalid data")
    public void verifyPossibilityRegistrationInvalidData(InvalidRegistrationData invalidData, String errorMessage, int statusCod) {

        Response response = given()
                .spec(setUp(invalidData))
                .when()
                .post(BASE_URL + REG_END_POINT_URL);

        assertThat(response.getStatusCode()).isEqualTo(statusCod);
        assertThat(response.getBody().jsonPath().get("error.message").toString()).contains(errorMessage);

    }
}
