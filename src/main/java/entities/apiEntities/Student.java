package entities.apiEntities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student{
    public int id;
    public String email;
    public String firstName;
    public String lastName;
    public String avatarUrl;
}