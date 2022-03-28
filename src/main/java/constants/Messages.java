package constants;

public class Messages {

    public interface AlertMessages {
        String  MESSAGE_ALERT_REQUIRED_FIELD = "This field is required",
                MESSAGE_ALERT_INCORRECT_EMAIL = "'Email' is not a valid email address.",
                MESSAGE_ALERT_INCORRECT_PASSWORD_1 = "The length of 'Password' must be at least 8 characters. You entered 5 characters.",
                MESSAGE_ALERT_INCORRECT_PASSWORD_2 = "Password must have at least eight characters, at least one uppercase letter, one lowercase letter one number and special character",
                MESSAGE_ALERT_INCORRECT_CREDENTIAL = "Incorrect credential, please try again.",
                MESSAGE_ALERT_TOO_SHORT_DATA = "Too short",
                MESSAGE_ALERT_TOO_LONG_DATA = "Too long",
                MESSAGE_ALERT_INVALID_FIRST_NAME = "Invalid first name",
                MESSAGE_ALERT_INVALID_LAST_NAME = "Invalid last name",
                MESSAGE_ALERT_INVALID_EMAIL_ADDRESS = "Invalid email address",
                MESSAGE_ALERT_INVALID_PASSWORD = "Password must contain at least one uppercase, one lowercase, one number and one special symbol (!@#$%^&*()_+-=)",
                MESSAGE_ALERT_TOO_SHORT_PASSWORD = "Password must contain at least 8 characters",
                MESSAGE_ALERT_TOO_LONG_PASSWORD = "Password must contain 16 characters maximum",
                MESSAGE_ALERT_CONFIRM_PASSWORD = "You should confirm your password";
    }

    public interface DoneMessages {
        String MESSAGE_DONE_REGISTRATION = "Congratulations",
               MESSAGE_DONE_REGISTRATION_TEXT = "You have successfully registered. Please, wait until your account is approved and your role is assigned.",
               MESSAGE_DONE_FORGOT_PASSWORD = "Forgot password information",
                MESSAGE_DONE_FORGOT_PASSWORD_TEXT = "Please check your email and follow the link to reset your password.";
    }
}
