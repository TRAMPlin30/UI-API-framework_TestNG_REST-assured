package testApi.secretaries;


import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import testApi.base.BaseApiTest;

import java.util.Map;

import static constants.ApiConstantsURL.secretaries.SECRETARIES;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

public class SecretariesListApiTest extends BaseApiTest {

    @Test
    public void canGetSecretariesList() {
        String secretariesList = given()
                .spec(login("Admin"))
                .when()
                .get(SECRETARIES)
                .then()
                .extract()
                .body()
                .asPrettyString();
        System.out.println(secretariesList);
    }

    @Test
    public void putValidSecretariesData() {
        String secretariesId = "6";
        Map<String, String> data = Map.of("email", "elizabeth.hill@example.com",
                "firstName", "Elli", "lastName", "Hill");
        given()
                .spec(login("Admin"))
                .body(data)
                .when()
                .put(SECRETARIES + secretariesId)
                .then()
                .assertThat()
                .statusCode(200)
                .and().log().body();
    }

    @Test
    public void putInvalidDataEmailSecretariesData() {
        String secretariesId = "100";
        Map<String, String> data = Map.of("email", "0",
                "firstName", "El", "lastName", "Hill");

        given()
                .spec(login("Admin"))
                .body(data)
                .when()
                .put(SECRETARIES + secretariesId)
                .then()
                .assertThat()
                .statusCode(400)
                .and().log().body();
    }

    @Test
    public void putInvalidDataMessagesSecretariesData() {
        String secretariesId = "6";

        Response responseBody = given()
                .spec(login("Admin"))
                .contentType(ContentType.JSON)
                .body(InvalidDataSecretariesApi
                        .builder()
                        .email("0")
                        .firstName("Elli")
                        .requestCode(0)
                        .requestError("'Email' is not a valid email address.")
                        .build())
                .log()
                .all()
                .when()
                .put(SECRETARIES + secretariesId);
        assertThat(responseBody.getBody().jsonPath().get("error.message")
                .toString()).contains("'Email' is not a valid email address.");
        assertThat(responseBody.getStatusCode()).isEqualTo(400);

    }

    @Test
    public void putNotFoundSecretaries() {
        String secretariesId = "100";

        Response responseBody = given()
                .spec(login("Admin"))
                .contentType(ContentType.JSON)
                .body(InvalidDataSecretariesApi
                        .builder()
                        .email("b@gmail.com")
                        .firstName("Enn")
                        .requestCode(3)
                        .requestError("Secretary not found")
                        .build())
                .log()
                .all()
                .when()
                .put(SECRETARIES + secretariesId);
        assertThat(responseBody.getBody().jsonPath().get("error.message")
                .toString()).contains("Secretary not found");
        assertThat(responseBody.getStatusCode()).isEqualTo(404);

    }

}
