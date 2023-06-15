package models;
import lombok.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Author implements Serializable {
    private long id;
    private String firstName;
    private String lastName;


}