package CursoUdemy.JDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, IOException {

        Connection conn = DB.getConnection();
        DB.closeConnection();
    }
}
