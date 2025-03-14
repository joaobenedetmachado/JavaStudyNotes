package CursoUdemy.JDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MainUPDATE {
    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = DB.getConnection();
            ps = conn.prepareStatement("UPDATE seller "
            + "SET BaseSalary = ?" +
                    "WHERE Id = ?");

            System.out.println("ID PARA MUDAR: ");
            int IdToChange = sc.nextInt();
            System.out.println("NOVA BaseSalary: ");
            double NewBaseSalary = sc.nextDouble();

            ps.setInt(2, IdToChange);
            ps.setDouble(1, NewBaseSalary);
            ps.executeUpdate();


        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Feito");
            DB.closeStatament(ps);
            DB.closeConnection();
        }


    }
}
