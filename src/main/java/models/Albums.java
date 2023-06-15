package models;

import lombok.*;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor

    public class Albums implements Serializable {
        private long id;
        private String artist;
        private String name;
        private long releaseDate;
        private int sales;
        private String genre;


}


