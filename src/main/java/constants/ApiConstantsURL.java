package constants;

public class ApiConstantsURL {


    public interface accounts {
        String BASE_URL = "https://whatbackendapi.azurewebsites.net",
                AUTH_END_POINT_URL = "/api/v2/accounts/auth",
                REG_END_POINT_URL = "/api/v2/accounts/reg",
                ACCOUNTS_LIST_END_POINT_URL = "/api/v2/accounts",
                PASSWORD_UPDATE_END_POINT_URL = "/api/v2/accounts/password",
                PASSWORD_FORGOT_END_POINT_URL = "/api/v2/accounts/password/forgot",
                LOCAL_WHAT_FORM_URL = "http://localhost:8080/forgot-password",
                STUDENTS_END_POINT_URL = "/api/v2/students/{studentId}",
                STUDENTS_END_POINT_URL_ALL = "/api/v2/students",
                STUDENTS_END_POINT_URL_ACTIVE = "/api/v2/students/active";
    }

    public interface courses {
        String COURSE_END_POINT_URL = "/api/v2/courses",
                COURSE_ID_END_POINT_URL = "/api/v2/courses/{id}";
    }

    public interface secretaries {
        String SECRETARIES = "/api/v2/secretaries/";
        String LIST_OF_SECRETARIES_END_POINT_URL = "/api/v2/secretaries";
    }

    public interface testDataPaths {
        String INVALID_LOGIN_DATA = "D:\\Softserve\\WHAT_API\\WHAT_TAQC_JavaDP223\\src\\main\\resources\\api\\authenticationData\\InvalidData.json";
    }

    public interface unassignedUsers {
        String LIST_OF_UNASSIGNED_USERS_END_POINT_URL = "/api/v2/accounts/NotAssigned",
                ASSIGNED_UNASSIGNED_USER_TO_MENTOR_ROLE = "/api/v2/mentors/{accountId}",
                ASSIGNED_UNASSIGNED_USER_TO_SECRETARY_ROLE = "/api/v2/secretaries/{accountId}",
                ASSIGNED_UNASSIGNED_USER_TO_STUDENT_ROLE = "/api/v2/students/{accountId}";
    }

    public interface mentors {
        String LIST_OF_MENTORS_END_POINT_URL = "/api/v2/mentors";
    }

    public interface students {
        String LIST_OF_STUDENTS_END_POINT_URL = "/api/v2/students";
    }

}
