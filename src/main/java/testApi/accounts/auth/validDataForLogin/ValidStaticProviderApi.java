package testApi.accounts.auth.validDataForLogin;

import org.testng.annotations.DataProvider;

public class ValidStaticProviderApi {

    @DataProvider (name = "validData")
    public static Object[][] createValidLoginData() {
        return new Object[][]{
                {"Admin"},
                {"Secretary"},
                {"Mentor"},
                {"Student"}};
    }
    @DataProvider (name = "invalidData")
    public static Object[][] createInvalidLoginData() {
        return new Object[][]{
                {"Secretary"},
                {"Mentor"},
                {"Student"}};
    }
}
