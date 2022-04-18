package pages.registration.validDataForRegistration;

import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static constants.Constants.testDataPaths.*;
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

        File file = new File(CREATED_USERS_DATA_JSON);
        FileWriter fileWriter = null;
            fileWriter = new FileWriter(file, true);
            fileWriter.write("\"email\"" +":" + "\"" + email + "\"" + "\n" + "}");
            fileWriter.close();

        System.out.println(email);
        return email;
    }

    public static String getName() throws IOException {
        List<String> nameList = names().first().list(1).get();
        String name;
        name = nameList.get(0);

        File file = new File(CREATED_USERS_DATA_JSON);
        FileWriter fileWriter = null;
            fileWriter = new FileWriter(file, true);
            fileWriter.write("\"name\"" +":" + "\"" + name + "\"" + ",\n");
            fileWriter.close();

        System.out.println(name);
        return name;
    }

    public static String getSureName() throws IOException {
        List<String> SureNameList = names().last().list(1).get();
        String sureName;
        sureName = SureNameList.get(0);

        File file = new File(CREATED_USERS_DATA_JSON);
        FileWriter fileWriter = null;
        fileWriter = new FileWriter(file, true);
        fileWriter.write("\"sureName\"" +":" + "\""+ sureName + "\"" + ",\n");
        fileWriter.close();

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
        File file = new File(CREATED_USERS_DATA_JSON);
        FileWriter fileWriter = null;
        fileWriter = new FileWriter(file, false);
        fileWriter.write("{" + "\n" + "\"password\"" +":" + "\""+ password + "\"" + ",\n");
        fileWriter.close();

        System.out.println(password);
        return password.toString();
    }
}







