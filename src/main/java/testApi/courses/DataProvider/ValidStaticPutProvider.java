package testApi.courses.DataProvider;

import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.util.List;

import static net.andreinc.mockneat.unit.user.Names.names;

public class ValidStaticPutProvider {

    private static String getCourseName() throws IOException {
        List<String> courses = names().append(" courses").list(1).get();
        String courseName;
        courseName = courses.get(0);
        return courseName;
    }

    @DataProvider(name = "validData")
    public static Object[][] createInvalidCourseData() throws IOException {
        return new Object[][]{
                {getCourseName()},
        };
    }
}
