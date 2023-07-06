package models;
import com.mysql.cj.jdbc.Driver;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Ad {
    private long id;
    private long user_id;
    private String title;
    private String description;


    public Ad(long userId, String title, String description) {

        this.user_id = userId;
        this.title = title;
        this.description = description;
    }
}