package dao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import models.Ad;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListAdsDao implements Ads {
    private List<Ad> ads;

    public List<Ad> all() {
        if (ads == null) {
            ads = generateAds();
        }
        return ads;
    }

    public void insertAd(Ad ad) {
        // make sure we have ads
        if (ads == null) {
            ads = generateAds();
        }
        ad.setId(ads.size());//set ad ID
        ads.add(ad);
    }


    @Override
    public MySQLAdsDao insert(Ad Ad) {
        return null;
    }



    private List<Ad> generateAds() {
        List<Ad> ads = new ArrayList<>();
        ads.add(new Ad(
            1,
            1,
            "playstation for sale",
            "This is a slightly used playstation"
        ));
        ads.add(new Ad(
            2,
            1,
            "Super Nintendo",
            "Get your game on with this old-school classic!"
        ));
        ads.add(new Ad(
            3,
            2,
            "Junior Java Developer Position",
            "Minimum 7 years of experience required. You will be working in the scripting language for Java, JavaScript"
        ));
        ads.add(new Ad(
            4,
            2,
            "JavaScript Developer needed",
            "Must have strong Java skills"
        ));
        return ads;
    }
}

