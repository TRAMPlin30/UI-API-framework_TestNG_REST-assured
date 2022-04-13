package entities;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import properties.JsonReader;

import java.io.IOException;

import static constants.Constants.testDataPathsMyProfile.*;

@Data
@JsonAutoDetect
public class UnassignedUser {

    private String password;
    private String firstName;
    private String lastName;
    private String email;

    public UnassignedUser() {}

    public static UnassignedUser createUser(String role) {
        String jsonPath = null;
        switch (role) {
            case  "Unassigned":
                jsonPath = CREATED_USERS_DATA_JSON;
                break;
        }
        ObjectMapper objectMapper = new ObjectMapper();
        UnassignedUser user = null;
        try {
            String jsonString = JsonReader.getJsonFile(jsonPath);
            user = objectMapper.readValue(jsonString, UnassignedUser.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return user;
    }
}



