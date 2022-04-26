package entities.apiEntities;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InvalidRegistrationData {

    private  String firstName;
    private  String LastName;
    private  String email;
    private  String password;
    private  String confirmPassword;


}
