package dao;
import models.Ad;
import com.mysql.cj.jdbc.Driver;
import java.util.List;

public interface Ads {

    List<Ad> all(); // get a list of all the ads
    void insertAd(Ad ad);  // insert a new ad and return the new ad's id

    MySQLAdsDao insert(Ad Ad);
}

