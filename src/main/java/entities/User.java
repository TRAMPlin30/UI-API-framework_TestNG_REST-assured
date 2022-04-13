package entities;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import properties.JsonReader;

import java.io.IOException;

import static constants.Constants.testDataPaths.*;

@Data
@JsonAutoDetect
public class User {

    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private int role;
    private int id;

    public User() {}

    public static User createUser(String role) {
        String jsonPath = null;
        switch (role) {
            case "Admin":
                jsonPath = ADMIN_DATA_JSON;
                break;
            case "Mentor":
                jsonPath = MENTOR_DATA_JSON;
                break;
            case "Secretary":
                jsonPath = SECRETARY_DATA_JSON;
                break;
            case "Student":
                jsonPath = STUDENT_DATA_JSON;
                break;
            case  "Unassigned":
                jsonPath = CREATED_USERS_DATA_JSON;
                break;
        }
        ObjectMapper objectMapper = new ObjectMapper();
        User user = null;
        try {
            String jsonString = JsonReader.getJsonFile(jsonPath);
            user = objectMapper.readValue(jsonString, User.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return user;
    }
}
