package testApi.accounts.auth.invalidDataForLogin;

import entities.apiEntities.InvalidLoginDataApi;
import org.testng.annotations.DataProvider;

import static constants.ApiConstantsURL.testDataPaths.INVALID_LOGIN_DATA;

public class InvalidStaticProviderApi {

    @DataProvider(name = "invalidData_400")
    public static Object[][] DataProvider_400() {
        InvalidLoginDataApi[] dataApis = InvalidLoginDataApi.create(INVALID_LOGIN_DATA);
        Object[][] data = new Object[dataApis.length][1];
        for (int i = 0; i < dataApis.length; i++) {
            data[i][0] = dataApis[i];
        }
        return data;
    }

    @DataProvider(name = "invalidData_401")
    public static Object[][] DataProvider_401() {

        return new Object[][]{
                {"юзер@example.com", "0XyCwz_U"},
                {"mary.lewis@example.com", "0XyCwz_UГ"},
                {"ary.lewis@example.com", "0XyCwz_U"}
        };
    }
}
