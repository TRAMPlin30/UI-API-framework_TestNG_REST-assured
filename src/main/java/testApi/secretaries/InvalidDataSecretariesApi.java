package testApi.secretaries;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InvalidDataSecretariesApi {
    private String email;
    private String firstName;
    private Integer requestCode;
    private String requestError;
}
