package CursoUdemy.JDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MainDELETE {
    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);

        Connection conn = null;
        PreparedStatement ps = null;

        System.out.println("ID to delete: ");
        int id = sc.nextInt();

        try  {

            conn = DB.getConnection();
            ps = conn.prepareStatement("DELETE FROM seller where id = ?");

            ps.setInt(1, id);

            ps.executeUpdate();

        } catch (SQLException | IOException  e) {
            throw new DbIntegrityException(e.getMessage());
        } finally {
            System.out.println("Feito! ");
            DB.closeStatament(ps);
            DB.closeConnection();
        }


    }
}
