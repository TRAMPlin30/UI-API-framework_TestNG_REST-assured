package testApi.accounts.auth;

import entities.apiEntities.AuthorizedUserApi;
import entities.User;
import org.testng.annotations.Test;
import testApi.accounts.auth.validDataForLogin.ValidStaticProviderApi;
import testApi.base.BaseApiTest;

import java.util.Map;

import static constants.ApiConstantsURL.accounts.AUTH_END_POINT_URL;
import static constants.ApiConstantsURL.accounts.BASE_URL;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ValidDataUserLoginApiTest extends BaseApiTest {

    protected User userData;
    protected AuthorizedUserApi authorizedUserApi;

    @Test(dataProviderClass = ValidStaticProviderApi.class, dataProvider = "createValidLoginData")
    public void verifyUserCanLogin(String role) {

        userData = User.createUser(role);
        Map<String, String> credentials = Map.of("email", userData.getEmail(), "password", userData.getPassword());

        authorizedUserApi = given()
                .spec(setUp(credentials))
                .when()
                .post(BASE_URL + AUTH_END_POINT_URL)
                .then()
                .statusCode(200)
                .extract()
                .as(AuthorizedUserApi.class);

        assertThat(userData.getFirstName()).contains(authorizedUserApi.getFirstName());
        assertThat(userData.getLastName()).contains(authorizedUserApi.getLastName());
        assertThat(userData.getRole()).isEqualTo(authorizedUserApi.getRole());

    }
}
