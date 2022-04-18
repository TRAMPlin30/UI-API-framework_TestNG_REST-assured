package constants;

public class Constants {

    public static final int IMPLICITLY_WAIT = 10;
    public static final int ELEMENT_WAIT = 5;

    public static final String AUTH_URL = "http://localhost:8080/auth",
            REGISTRATION_URL = "http://localhost:8080/registration",
            FORGOT_PASSWORD_URL = "http://localhost:8080/forgot-password",
            STUDENTS_URL = "http://localhost:8080/students";

    public static final String COURSES_URL = "http://localhost:8080/courses",
            COURSE_DETAILS_URL = "http://localhost:8080/courses/1",
            EDIT_COURSE_URL = "http://localhost:8080/courses/edit/7";

    public interface testDataPathsMyProfile {
        String ADMIN_DATA_JSON = "/Users/delitelnula/Desktop/SoftServeProj/WHAT_TAQC_JavaDP223/src/main/resources/testData/Admin.json",
                MENTOR_DATA_JSON = "/Users/delitelnula/Desktop/SoftServeProj/WHAT_TAQC_JavaDP223/src/main/resources/testData/Mentor.json",
                SECRETARY_DATA_JSON = "/Users/delitelnula/Desktop/SoftServeProj/WHAT_TAQC_JavaDP223/src/main/resources/testData/Secretary.json",
                STUDENT_DATA_JSON = "/Users/delitelnula/Desktop/SoftServeProj/WHAT_TAQC_JavaDP223/src/main/resources/testData/Student.json",
                CREATED_USERS_DATA_JSON = "/Users/delitelnula/Desktop/SoftServeProj/WHAT_TAQC_JavaDP223/src/main/resources/testData/CreatedUser.json",
                PASSWORD = "/Users/delitelnula/Desktop/SoftServeProj/WHAT_TAQC_JavaDP223/src/main/resources/testData/Password.json",
                INVALID_DATA = "/Users/delitelnula/Desktop/SoftServeProj/WHAT_TAQC_JavaDP223/src/main/resources/testData/PasswordData.json";
    }

    public interface testDataPaths {
        String dir = "D:/Softserve/WHAT_API/WHAT_TAQC_JavaDP223";
        String ADMIN_DATA_JSON = dir + "\\src\\main\\resources\\testData\\Admin.json",
                MENTOR_DATA_JSON = dir + "\\src\\main\\resources\\testData\\Mentor.json",
                SECRETARY_DATA_JSON = dir + "\\src\\main\\resources\\testData\\Secretary.json",
                STUDENT_DATA_JSON = dir + "\\src\\main\\resources\\testData\\Student.json",
                CREATED_USERS_DATA_JSON = dir + "\\src\\main\\resources\\testData\\CreatedUser.json",
                INVALID_DATA_FIRST_NAME_FIELD_JSON = dir + "\\src\\main\\resources\\registration\\InvalidDataFirstName.json",
                INVALID_DATA_LAST_NAME_FIELD_JSON = dir + "\\src\\main\\resources\\registration\\InvalidDataLastName.json",
                INVALID_DATA_EMAIL_FIELD_JSON = dir + "\\src\\main\\resources\\registration\\InvalidDataEmail.json",
                INVALID_DATA_PASSWORD_FIELD_JSON = dir + "\\src\\main\\resources\\registration\\InvalidDataPassword.json",
                INVALID_DATA_PASSWORD_CONFIRM_FIELD_JSON = dir + "\\src\\main\\resources\\registration\\InvalidDataPasswordConfirm.json",
                INVALID_DATA_EMAIL_LOGIN_FIELD_JSON = dir + "\\src\\main\\resources\\auth\\InvalidDataEmail.json",
                INVALID_DATA_PASSWORD_LOGIN_FIELD_JSON = dir + "\\src\\main\\resources\\auth\\InvalidDataPassword.json";
        String PASSWORD = dir + "\\src\\main\\resources\\testData\\Password.json";
        String INVALID_DATA = dir + "\\src\\main\\resources\\testData\\PasswordData.json";
    }
}
