package testApi.courses.DataProvider;

import org.testng.annotations.DataProvider;

public class InvalidStaticPutProvider {

    @DataProvider (name = "invalidData")
    public static Object[][] createInvalidCourseData() {
        return new Object[][]{
                {" ", "'Name' must not be empty."},
                {"Test Course Test Course Test Course Test Course Test Course Test Course Test Course Test Course Test Course", "The length of 'Name' must be 100 characters or fewer. You entered 107 characters."}
            };
    }
}
