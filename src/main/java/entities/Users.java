package entities;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import properties.JsonReader;

import java.io.IOException;

import static constants.Constants.testDataPathsMyProfile.*;

@Data
@JsonAutoDetect
public class Users {

    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private int role;
    private int id;

    public Users() {}

    public static Users createUser(String role) {
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
        Users users = null;
        try {
            String jsonString = JsonReader.getJsonFile(jsonPath);
            users = objectMapper.readValue(jsonString, Users.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }
}
