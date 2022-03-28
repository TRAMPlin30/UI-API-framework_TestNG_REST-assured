package properties;

public enum Roles {

    ADMIN         ("mary.lewis@example.com", "0XyCwz_U", "Mary Lewis"),
    SECRETARY     ("jennifer.turner@example.com", "I_dU89Hi", "Jennifer Turner"),
    MENTOR        ("linda.jackson@example.com", "_pAyqIf8", "Linda Jackson");


    private final String email;
    private final String password;
    private final String fullName;

    Roles(String email, String password, String fullName) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;

    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

}

