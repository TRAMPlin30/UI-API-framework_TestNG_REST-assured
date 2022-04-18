package testApi.registration.validDataForRegistration;

import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.util.List;

import static net.andreinc.mockneat.unit.user.Emails.emails;
import static net.andreinc.mockneat.unit.user.Names.names;

public class ValidStaticProvider {
    @DataProvider (name = "create")
    public static Object[][] createRegistrationData() throws IOException {
        String newPassword = getPassword();
        return new Object[][]{
                {getName(), getSureName(), getEmail(), newPassword, newPassword}
        };
    }

    public static String getEmail() throws IOException {
        List<String> emailList = emails().domain("whatapp.com").list(1).get();
        String email;
        email = emailList.get(0);
        System.out.println(email);
        return email;
    }

    public static String getName() throws IOException {
        List<String> nameList = names().first().list(1).get();
        String name;
        name = nameList.get(0);
        System.out.println(name);
        return name;
    }

    public static String getSureName() throws IOException {
        List<String> SureNameList = names().last().list(1).get();
        String sureName;
        sureName = SureNameList.get(0);
        System.out.println(sureName);
        return sureName;
    }

    public static String getPassword() throws IOException {
        StringBuilder password = new StringBuilder();
        int size = 2;
        int i = 0;

        while (i != size) {
            String upper = PasswordData.upperSymbol();
            String lower = PasswordData.lowerSymbol();
            String number = PasswordData.numberSymbol();
            String symbol = PasswordData.symbolsSymbol();
            password.append(upper).append(lower).append(number).append(symbol);
            i++;
            }
        System.out.println(password);
        return password.toString();
    }
}







