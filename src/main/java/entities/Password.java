package entities;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

import java.io.File;
import java.io.IOException;

import static constants.Constants.testDataPathsMyProfile.PASSWORD;

@Data
@JsonAutoDetect
public class Password {
    private String currentPassword;
    private String newPassword;
    private String confirmPassword;

    public static Password createPassword() {
        ObjectMapper objectMapper = new ObjectMapper();
        Password password = new Password();
        try {
            File file = new File(PASSWORD);
            password = objectMapper.readValue(file, Password.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return password;
    }
}
