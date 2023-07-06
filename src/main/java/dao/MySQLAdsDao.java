package dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import models.Ad;
import models.Config;
import models.DbConnect;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.List;

@Data
@AllArgsConstructor
public class MySQLAdsDao implements Ads {
    private Connection connection;


    public MySQLAdsDao(Config config) {
        connection = DbConnect.getDbConnection(config.getUrl(), config.getUsername(), config.getPassword());
    }


    public Ad getAdById(int id) {
        Ad ad = null;
        String query = "SELECT * FROM ads WHERE id = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int adId = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                ad = new Ad(adId, title, description);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ad;
    }


    public void insertAds(Ad ad) {
        String query = "INSERT INTO ads (title, description) VALUES (?, ?)";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, ad.getTitle());
            statement.setString(2, ad.getDescription());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public List<Ad> all() {
        return null;
    }

    @Override
    public void insertAd(Ad ad) {

    }

    @Override
    public MySQLAdsDao insert(Ad Ad) {
        return null;
    }
}

