
package rest.demo.practice.service;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionService {

    private static Connection connection;

    public static synchronized Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/rest-demodb";
        String user = "root";
        String password = "root";
        Driver driver = new Driver();
        DriverManager.registerDriver(driver);
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return connection;
        } else {
            return connection;
        }
    }

}
