package CursoUdemy.JDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class MainPOST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Connection conn = null;
        PreparedStatement ps = null;


        try {
            conn = DB.getConnection();

            ps = conn.prepareStatement(
                        "INSERT INTO seller" +
                            "(Name, Email, BirthDate, BaseSalary, DepartmentID)" +
                            "values(?, ?, ?, ?, ?)"
            );

            System.out.println("Your name: ");
            String nome = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Birth Date [dd/mm/yyyy]: ");
            String date = sc.nextLine();
            System.out.println("Base Salary: ");
            Double baseSalary = sc.nextDouble();
            System.out.println("Departament ID");
            Integer did = sc.nextInt();



            ps.setString(1,nome);
            ps.setString(2, email);
            ps.setDate(3, new java.sql.Date(sdf.parse(date).getTime()));
            ps.setDouble(4, baseSalary);
            ps.setInt(5, did);

            int rowAffected = ps.executeUpdate();

            System.out.println("FEITO");
            System.out.println(rowAffected);
        } catch (SQLException | IOException e) {
            throw new DbException(e.getMessage());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
