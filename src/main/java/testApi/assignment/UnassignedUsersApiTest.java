package testApi.assignment;

import entities.RegisteredUser;
import entities.apiEntities.ValidRegistrationData;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testApi.base.BaseApiTest;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import static constants.ApiConstantsURL.accounts.*;
import static constants.ApiConstantsURL.unassignedUsers.*;

public class UnassignedUsersApiTest extends BaseApiTest {

    public static ValidRegistrationData validRegistrationData = new ValidRegistrationData();
    public static RegisteredUser registeredUser = null;

    @BeforeMethod
    public static RegisteredUser registration() {
        registeredUser = given()
                .contentType(ContentType.JSON)
                .body(validRegistrationData)
                .log().method().and().log().uri()
                .when()
                .post(BASE_URL + REG_END_POINT_URL)
                .then()
                .assertThat()
                .statusCode(200)
                .log().body().and().log().status()
                .extract().as(RegisteredUser.class);
        return registeredUser;
    }

    @Test
    public void verifyUnassignedUsersById() {
        int id = registeredUser.getId();
        List<Integer> unassignedUsersId = given()
                .spec(login("Admin"))
                .when()
                .get(LIST_OF_UNASSIGNED_USERS_END_POINT_URL)
                .then()
                .extract().jsonPath().getList("id");
        assertThat(unassignedUsersId.contains(id));
    }
}
