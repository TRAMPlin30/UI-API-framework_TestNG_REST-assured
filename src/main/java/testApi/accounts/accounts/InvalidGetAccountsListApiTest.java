package testApi.accounts.accounts;

import org.testng.annotations.Test;
import testApi.accounts.auth.validDataForLogin.ValidStaticProviderApi;
import testApi.base.BaseApiTest;

import static constants.ApiConstantsURL.accounts.ACCOUNTS_LIST_END_POINT_URL;
import static constants.ApiConstantsURL.accounts.BASE_URL;
import static io.restassured.RestAssured.given;

public class InvalidGetAccountsListApiTest extends BaseApiTest {

    @Test (description = "Forbidden (unauthorized as Admin)",
            dataProviderClass = ValidStaticProviderApi.class, dataProvider = "invalidData")
    public void verifyErrorMessages_403(String role) {

        given()
                .spec(login(role))
                .when()
                .get(ACCOUNTS_LIST_END_POINT_URL)
                .then()
                .statusCode(403);
    }

    @Test (description = "Unauthorized (not authorized in any way)")
    public void verifyErrorMessages_401() {

        given()
                .spec(setUp())
                .when()
                .get(BASE_URL + ACCOUNTS_LIST_END_POINT_URL)
                .then()
                .statusCode(401);
    }
}
