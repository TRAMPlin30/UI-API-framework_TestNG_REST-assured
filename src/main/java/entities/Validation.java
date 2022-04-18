package entities;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

import java.io.File;
import java.io.IOException;

import static constants.Constants.testDataPaths.INVALID_DATA;

@Data
@JsonAutoDetect
public class Validation {
    private String lowerCaseLetter;
    private String upperCaseLetter;
    private String symbol;
    private String number;

    public static Validation createNewPassword() {
        ObjectMapper objectMapper = new ObjectMapper();
        Validation newPassword = new Validation();
        try {
            File file = new File(INVALID_DATA);
            newPassword = objectMapper.readValue(file, Validation.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newPassword;
    }
}
