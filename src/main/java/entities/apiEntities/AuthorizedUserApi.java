package entities.apiEntities;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Getter;

import java.util.Map;

@Getter
@JsonAutoDetect
public class AuthorizedUserApi {

    public String firstName;
    public String lastName;
    public int role;
    public Map<String, String> roleList;

    @Override
    public String toString() {
        return "AuthorizedUser{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role=" + role +
                ", roleList=" + roleList +
                '}';
    }
}
