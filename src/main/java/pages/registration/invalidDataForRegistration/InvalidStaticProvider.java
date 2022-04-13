package pages.registration.invalidDataForRegistration;

import org.testng.annotations.DataProvider;
import entities.InvalidDataEntity;

import static constants.Constants.testDataPaths.*;

public class InvalidStaticProvider {

    public static InvalidDataEntity[] invalidDataFirstNameList = InvalidDataEntity.createInvalidData(INVALID_DATA_FIRST_NAME_FIELD_JSON);
    public static InvalidDataEntity[] invalidDataLastNameField = InvalidDataEntity.createInvalidData(INVALID_DATA_LAST_NAME_FIELD_JSON);
    public static InvalidDataEntity[] invalidDataEmailField = InvalidDataEntity.createInvalidData(INVALID_DATA_EMAIL_FIELD_JSON);
    public static InvalidDataEntity[] invalidDataPasswordField = InvalidDataEntity.createInvalidData(INVALID_DATA_PASSWORD_FIELD_JSON);
    public static InvalidDataEntity[] invalidDataPasswordConfirmField = InvalidDataEntity.createInvalidData(INVALID_DATA_PASSWORD_CONFIRM_FIELD_JSON);


    @DataProvider(name = "invalidFirstName")
    public static Object[][] DataProviderFirstName() {
        Object[][] data = new Object[invalidDataFirstNameList.length][1];
        for (int i = 0; i < invalidDataFirstNameList.length; i++) {
            data[i][0] = invalidDataFirstNameList[i];
        }
        return data;
    }

    @DataProvider(name = "invalidLastName")
    public static Object[][] DataProviderLastName() {
        Object[][] data = new Object[invalidDataLastNameField.length][1];
        for (int i = 0; i < invalidDataLastNameField.length; i++) {
            data[i][0] = invalidDataLastNameField[i];
        }
        return data;
    }

    @DataProvider(name = "invalidEmail")
    public static Object[][] DataProviderEmail() {
        Object[][] data = new Object[invalidDataEmailField.length][1];
        for (int i = 0; i < invalidDataEmailField.length; i++) {
            data[i][0] = invalidDataEmailField[i];
        }
        return data;
    }

    @DataProvider(name = "invalidPassword")
    public static Object[][] DataProviderPassword() {
        Object[][] data = new Object[invalidDataPasswordField.length][1];
        for (int i = 0; i < invalidDataPasswordField.length; i++) {
            data[i][0] = invalidDataPasswordField[i];
        }
        return data;
    }

    @DataProvider(name = "invalidConfirmPassword")
    public static Object[][] DataProviderConfirmPassword() {
        Object[][] data = new Object[invalidDataPasswordConfirmField.length][1];
        for (int i = 0; i < invalidDataPasswordConfirmField.length; i++) {
            data[i][0] = invalidDataPasswordConfirmField[i];
        }
        return data;
    }
}