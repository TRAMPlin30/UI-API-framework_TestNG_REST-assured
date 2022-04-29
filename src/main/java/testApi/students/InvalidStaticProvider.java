package testApi.students;

import org.testng.annotations.DataProvider;

public class InvalidStaticProvider {
    @DataProvider(name="invalidDataEmail")
    public static Object[][] createInvalidStudentData(){
        return new Object[][]{
                {""},
        };
    }

    @DataProvider (name="invalidDataFirstName")
    public static Object [][] createInvalidStudentFirstName(){
        return new Object[][] {
                {"1234567890123456789012345678901"},
        };
    }
}