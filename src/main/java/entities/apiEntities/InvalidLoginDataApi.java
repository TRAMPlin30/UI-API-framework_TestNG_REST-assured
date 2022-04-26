package entities.apiEntities;


import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import java.io.File;
import java.io.IOException;

@Getter
@ToString
//@Builder
public class InvalidLoginDataApi {

    private String email;
    private String password;
    private Integer errorCode;
    private String errorMessage;

    public static InvalidLoginDataApi[] create(String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        InvalidLoginDataApi[] invalidData = new InvalidLoginDataApi[100];
        try {
            File file = new File(filePath);
            invalidData = objectMapper.readValue(file, InvalidLoginDataApi[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return invalidData;
    }


}
