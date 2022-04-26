package entities.apiEntities;

import lombok.Getter;

@Getter
public class BadRequestApi {

    public Error error;

    public static class Error {
        public Integer code;
        public String message;

        @Override
        public String toString() {
            return "Error{" +
                    "code=" + code +
                    ", message='" + message + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "BadRequest{" +
                "error=" + error +
                '}';
    }

}
