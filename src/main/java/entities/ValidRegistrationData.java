package entities;

import lombok.Getter;
import testApi.registration.validDataForRegistration.ValidStaticProvider;


import java.io.IOException;

@Getter
public class ValidRegistrationData {

    private final String firstName;
    private final String LastName;
    private final String email;
    private final String password;
    private final String confirmPassword;

    public ValidRegistrationData() {

        String firstName = null;
        String LastName = null;
        String email = null;
        String password = null;
        String confirmPassword = null;
        try {
            firstName = ValidStaticProvider.getName();
            LastName = ValidStaticProvider.getSureName();
            email = ValidStaticProvider.getEmail();
            password = ValidStaticProvider.getPassword();
            confirmPassword = password;
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.firstName = firstName;
        this.LastName = LastName;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }
}
