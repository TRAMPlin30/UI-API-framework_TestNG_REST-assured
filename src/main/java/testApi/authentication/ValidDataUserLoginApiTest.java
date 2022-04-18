package testApi.authentication;

import org.testng.annotations.Test;
import testApi.base.BaseApiTest;

import static io.restassured.RestAssured.given;

public class ValidDataUserLoginApiTest extends BaseApiTest {

    @Test
    public void verifyUserCanLogin() {

       given()
                .spec(login("Admin"))
                .when()
                .get()
                .then()
                .statusCode(200);

    }
}
