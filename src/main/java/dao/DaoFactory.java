package dao;

import com.mysql.cj.jdbc.Driver;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import models.Config;

import java.util.List;

@NoArgsConstructor
@Data
public class DaoFactory {
    private static Ads adsDao;


    public static Ads getAdsDao(Config config) {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }
}

