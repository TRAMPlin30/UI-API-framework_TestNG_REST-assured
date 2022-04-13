package pages.auth.invalidDataForLogin;

import entities.InvalidDataEntity;
import org.testng.annotations.DataProvider;

import static constants.Constants.testDataPaths.*;

public class InvalidStaticProvider {

    public static InvalidDataEntity[] invalidDataEmailField = InvalidDataEntity.createInvalidData(INVALID_DATA_EMAIL_LOGIN_FIELD_JSON);
    public static InvalidDataEntity[] invalidDataPasswordField = InvalidDataEntity.createInvalidData(INVALID_DATA_PASSWORD_LOGIN_FIELD_JSON);


    @DataProvider(name = "invalidEmail")
    public static Object[][] DataProviderEmail() {
        Object[][] data = new Object[invalidDataEmailField.length][2];
        for (int i = 0; i < invalidDataEmailField.length; i++) {
            data[i][0] = invalidDataEmailField[i];
            data[i][1] = "Gd2)Uf4#";
        }
        return data;
    }

    @DataProvider(name = "invalidPassword")
    public static Object[][] DataProviderPassword() {
        Object[][] data = new Object[invalidDataPasswordField.length][2];
        for (int i = 0; i < invalidDataPasswordField.length; i++) {
            data[i][0] = "stinkosnits@whatapp.com";
            data[i][1] = invalidDataPasswordField[i];
        }
        return data;
    }
}
