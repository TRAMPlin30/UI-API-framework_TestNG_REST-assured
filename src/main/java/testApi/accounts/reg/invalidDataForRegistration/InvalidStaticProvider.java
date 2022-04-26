package testApi.accounts.reg.invalidDataForRegistration;

import entities.apiEntities.InvalidRegistrationData;
import org.testng.annotations.DataProvider;

public class InvalidStaticProvider {

    @DataProvider (name = "invalidData")
    public static Object[][] NegativeDataProvider() {
        return new Object[][]{
                {InvalidRegistrationData.builder()
                        .firstName("Bob")
                        .LastName("Marley")
                        .email("linda.jackson@example.com")
                        .password("_pAyqIf8%")
                        .confirmPassword("_pAyqIf8%")
                        .build(),
                        "Account already exists!",
                        409},
                {InvalidRegistrationData.builder()
                        .firstName("Bob")
                        .LastName("Marley")
                        .email("poll.baker.example")
                        .password("_pAyqIf8%")
                        .confirmPassword("_pAyqIf8%")
                        .build(),
                        "'Email' is not a valid email address.",
                        400},
                {InvalidRegistrationData.builder()
                        .firstName("Bob")
                        .LastName("Marley")
                        .email("@poll.baker.example")
                        .password("_pAyqIf8%")
                        .confirmPassword("_pAyqIf8%")
                        .build(),
                        "'Email' is not a valid email address.",
                        400},
                {InvalidRegistrationData.builder()
                        .firstName("Bob")
                        .LastName("Marley")
                        .email("poll.baker.example@")
                        .password("_pAyqIf8%")
                        .confirmPassword("_pAyqIf8%")
                        .build(),
                        "'Email' is not a valid email address.",
                        400},
                {InvalidRegistrationData.builder()
                        .firstName("Bob")
                        .LastName("Marley")
                        .email("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq@example.com")
                        .password("_pAyqIf8%")
                        .confirmPassword("_pAyqIf8%")
                        .build(),
                        "The length of 'Email' must be 50 characters or fewer. You entered 63 characters.",
                        400},
                {InvalidRegistrationData.builder()
                        .firstName("Bob")
                        .LastName("Marley")
                        .email("lindajackson@whatapp.com")
                        .password("пyопА23_2")
                        .confirmPassword("пyопА23_2")
                        .build(),
                        "Password must have at least eight characters, at least one uppercase letter, one lowercase letter one number and special character",
                        400},
                {InvalidRegistrationData.builder()
                        .firstName("Bob")
                        .LastName("Marley")
                        .email("lindajackson@whatapp.com")
                        .password("hdugns23")
                        .confirmPassword("hdugns23")
                        .build(),
                        "Password must have at least eight characters, at least one uppercase letter, one lowercase letter one number and special character",
                        400},
                {InvalidRegistrationData.builder()
                        .firstName("Bob")
                        .LastName("Marley")
                        .email("lindajackson@whatapp.com")
                        .password("YHANK!4")
                        .confirmPassword("YHANK!4")
                        .build(),
                        "The length of 'Password' must be at least 8 characters. You entered 7 characters.",
                        400},
                {InvalidRegistrationData.builder()
                        .firstName("Bob")
                        .LastName("Marley")
                        .email("lindajackson@whatapp.com")
                        .password("Rsf_1")
                        .confirmPassword("Rsf_1")
                        .build(),
                        "The length of 'Password' must be at least 8 characters. You entered 5 characters.",
                        400},
                {InvalidRegistrationData.builder()
                        .firstName("Bob")
                        .LastName("Marley")
                        .email("lindajackson@whatapp.com")
                        .password("_pAyqIf8%_pAyqIf8%_pAyqIf8%_pAy")
                        .confirmPassword("Rsf_1")
                        .build(),
                        "The length of 'Password' must be 30 characters or fewer. You entered 31 characters.",
                        400},
                {InvalidRegistrationData.builder()
                        .firstName("BobBobBobBobBobBobBobBobBobBobf")
                        .LastName("Marley")
                        .email("lindajackson@whatapp.com")
                        .password("_pAyqIf8%")
                        .confirmPassword("_pAyqIf8%")
                        .build(),
                        "The length of 'First Name' must be 30 characters or fewer. You entered 31 characters.",
                        400},
                {InvalidRegistrationData.builder()
                        .firstName("Bob")
                        .LastName("MarleyMarleyMarleyMarleyMarleyy")
                        .email("lindajackson@whatapp.com")
                        .password("_pAyqIf8%")
                        .confirmPassword("_pAyqIf8%")
                        .build(),
                        "The length of 'Last Name' must be 30 characters or fewer. You entered 31 characters.",
                        400},

        };
    }
}
