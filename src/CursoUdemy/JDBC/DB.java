package CursoUdemy.JDBC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB{

    private static Connection conn = null;

    public static Connection getConnection() throws IOException, SQLException {
        if (conn == null) {
try {
    Properties props = loadProperties();
    String url = props.getProperty("dburl");
    conn = DriverManager.getConnection(url, props);
} catch (SQLException e) {
    throw new DbException(e.getMessage());
}
        }
        return conn;
    }

    public static void closeConnection() throws SQLException {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    private static Properties loadProperties() throws IOException {
        try (FileInputStream fs = new FileInputStream("src/CursoUdemy/JDBC/db.properties")){
            Properties props = new Properties();
            props.load(fs);
            return props;
        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }
}
