package testApi.base;

import com.google.gson.internal.LinkedTreeMap;
import entities.User;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

import static constants.ApiConstantsURL.accounts.AUTH_POINT_URL;
import static constants.ApiConstantsURL.accounts.BASE_URL;
import static io.restassured.RestAssured.given;

public abstract class BaseApiTest {

    protected User user;

    /**
     *  <p>The login() method takes a string as an argument:
     *  <p>"Admin", "Mentor", "Secretary", "Student".
     *  <p>Provide the required string for authentication.
     */

    public RequestSpecification login(String role) {
        return new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri(BASE_URL)
                .addHeader("authorization", takeToken(role))
                .build();
    }

    public Map<String, String> credentials(String role) {
        user = User.createUser(role);
        Map<String, String> credential = new LinkedTreeMap<>();
        credential.put("email", user.getEmail());
        credential.put("password", user.getPassword());
        return credential;
    }

    public String takeToken(String role) {
        return given()
                .contentType(ContentType.JSON)
                .body(credentials(role))
                .log()
                .all()
                .when()
                .post(BASE_URL + AUTH_POINT_URL)
                .then()
                .statusCode(200)
                .extract()
                .response()
                .header("authorization");
    }
}
