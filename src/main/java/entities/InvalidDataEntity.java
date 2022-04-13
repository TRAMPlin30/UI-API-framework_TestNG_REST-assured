package entities;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;

import java.io.File;
import java.io.IOException;

@Getter
public class InvalidDataEntity {

    private String firstNameValue;
    private String firstNameError;
    private String lastNameValue;
    private String lastNameError;
    private String emailValue;
    private String emailError;
    private String passwordValue;
    private String passwordError;

    public static InvalidDataEntity[] createInvalidData(String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        InvalidDataEntity[] invalidData = new InvalidDataEntity[0];
        try {
            File file = new File(filePath);
            invalidData = objectMapper.readValue(file, InvalidDataEntity[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return invalidData;
    }

    @Override
    public String toString() {
        return "InvalidDataEntity{" +
                "firstNameValue='" + firstNameValue + '\'' +
                ", firstNameError='" + firstNameError + '\'' +
                ", lastNameValue='" + lastNameValue + '\'' +
                ", lastNameError='" + lastNameError + '\'' +
                ", emailValue='" + emailValue + '\'' +
                ", emailError='" + emailError + '\'' +
                ", passwordValue='" + passwordValue + '\'' +
                ", passwordError='" + passwordError + '\'' +
                '}';
    }
}
