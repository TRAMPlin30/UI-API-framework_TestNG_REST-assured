package entities;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Getter;

@Getter
@JsonAutoDetect
public class RegisteredUser {

    public int id;
    public String firstName;
    public String lastName;
    public String email;
    public int role;
    public boolean isActive;

    @Override
    public String toString() {
        return "RegisteredUser{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                ", isActive=" + isActive +
                '}';
    }
}
