package constants;

public class Messages {

    public interface AlertMessages {
        String MESSAGE_ALERT_REQUIRED_FIELD = "This field is required",
                MESSAGE_ALERT_INCORRECT_EMAIL = "'Email' is not a valid email address.",
                MESSAGE_ALERT_INCORRECT_CREDENTIAL = "Incorrect credential, please try again.",
                MESSAGE_ALERT_TOO_SHORT_DATA = "Too short",
                MESSAGE_ALERT_TOO_LONG_DATA = "Too long",
                MESSAGE_ALERT_INVALID_FIRST_NAME = "Invalid first name",
                MESSAGE_ALERT_INVALID_LAST_NAME = "Invalid last name",
                MESSAGE_ALERT_INVALID_EMAIL_ADDRESS = "Invalid email address",
                MESSAGE_ALERT_INVALID_PASSWORD = "Password must contain at least one uppercase, one lowercase, one number and one special symbol (!@#$%^&*()_+-=)",
                MESSAGE_ALERT_TOO_SHORT_PASSWORD = "Password must contain at least 8 characters",
                MESSAGE_ALERT_TOO_LONG_PASSWORD = "Password must contain 16 characters maximum",
                MESSAGE_ALERT_CONFIRM_PASSWORD = "You should confirm your password",
                MESSAGE_ALERT_PROVIDE_NEW_PASSWORD = "You should provide a new password",
                MESSAGE_UNAUTHORIZED_401 = "Incorrect credentials, please try again.",
                MESSAGE_UNAUTHORIZED_403 = " is registered and waiting assign.",
                MESSAGE_ALERT_CHARACTERS  = "The length of 'First Name' must be 30 characters or fewer. You entered 31 characters.";

    }

    public interface DoneMessages {
        String MESSAGE_DONE_REGISTRATION = "Congratulations",
                MESSAGE_DONE_REGISTRATION_TEXT = "You have successfully registered. Please, wait until your account is approved and your role is assigned.",
                MESSAGE_DONE_FORGOT_PASSWORD = "Forgot password information",
                MESSAGE_DONE_FORGOT_PASSWORD_TEXT = "Please check your email and follow the link to reset your password.",
                MESSAGE_DONE_ASSIGNED_MENTOR = "×\n" + "Close alert\n" + "The user has been successfully assigned as a mentor",
                MESSAGE_DONE_ASSIGNED_SECRETARY = "×\n" + "Close alert\n" + "The user has been successfully assigned as a secretary",
                MESSAGE_DONE_ASSIGNED_STUDENT = "×\n" + "Close alert\n" + "The user has been successfully assigned as a student";
    }

    public interface Courses {
        String URL_MESSAGE = "URL is NOT correct!",
                TEXT_MESSAGE = "Text is NOT correct!",
                TEXT_SAME_MESSAGE = "Text is the same!",
                TEXT_NOT_SAME_MESSAGE = "Text is NOT the same!",
                DISABLED_BUTTON_MESSAGE = "Tab is DISABLED!",
                ENABLED_BUTTON_MESSAGE = "Tab is ENABLED!";
    }

    public interface UnassignedUsers {
        String MESSAGE_ALERT_ACCOUNT_IS_ASSIGNED = "This account already assigned.",
                MESSAGE_ACCOUNT_IS_NOT_FOUND = "Account not found";
    }
}
