package entities.apiEntities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UnassignedUsersApi {
    private int id;
    private Integer requestCode;
    private String requestError;
}
