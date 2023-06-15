package models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@NoArgsConstructor
@Getter
@Setter

    public class albums implements Serializable {
        private long id;
        private String artist;
        private String name;
        private long release_date;
        private int sales;
        private String genre;

    }


