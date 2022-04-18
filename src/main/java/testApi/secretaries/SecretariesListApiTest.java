package testApi.secretaries;

import org.testng.annotations.Test;
import testApi.base.BaseApiTest;

import static io.restassured.RestAssured.given;

public class SecretariesListApiTest extends BaseApiTest {

    @Test
    public void canGetSecretariesList() {
        String secretariesList = given()
                .spec(login("Admin"))
                .when()
                .get("/api/v2/secretaries")
                .then()
                .extract()
                .body()
                .asPrettyString();
        System.out.println(secretariesList);
    }
}

//               .auth().oauth2(takeToken())