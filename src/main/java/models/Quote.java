package models;

import lombok.*;
import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class Quote implements Serializable {
    private long id;
    private String author;
    private String quote;

}