package testApi.accounts.accounts;

import org.testng.annotations.Test;
import testApi.base.BaseApiTest;

import static constants.ApiConstantsURL.accounts.ACCOUNTS_LIST_END_POINT_URL;
import static io.restassured.RestAssured.given;

public class ValidGetAccountsListApiTest extends BaseApiTest {

    @Test
    public void verifyAdminGetAccountsList() {

        given()
                .spec(login("Admin"))
                .when()
                .get(ACCOUNTS_LIST_END_POINT_URL)
                .then()
                .statusCode(200)
                .extract()
                .body()
                .jsonPath()
                .prettyPrint();
        assert given()
                .spec(login("Admin"))
                .when()
                .get(ACCOUNTS_LIST_END_POINT_URL)
                .then()
                .extract()
                .jsonPath()
                .getList("email")
                .contains(user.getEmail());

    }
}
