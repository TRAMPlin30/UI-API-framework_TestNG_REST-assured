package constants;

public class ApiConstantsURL {


    public interface accounts {
        String BASE_URL = "https://whatbackendapi.azurewebsites.net",
                AUTH_END_POINT_URL = "/api/v2/accounts/auth",
                REG_END_POINT_URL = "/api/v2/accounts/reg",
                ACCOUNTS_LIST_END_POINT_URL = "/api/v2/accounts",
                PASSWORD_UPDATE_END_POINT_URL = "/api/v2/accounts/password";
    }

    public interface testDataPaths {
        String INVALID_LOGIN_DATA = "D:\\Softserve\\WHAT_API\\WHAT_TAQC_JavaDP223\\src\\main\\resources\\api\\authenticationData\\InvalidData.json";
    }


}
