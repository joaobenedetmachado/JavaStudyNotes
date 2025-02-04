package CursoUdemy.JDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainGET {
    public static void main(String[] args) throws SQLException, IOException {

        //Connection conn = DB.getConnection();
        //DB.closeConnection();

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = DB.getConnection(); // cria a conexao

            st = conn.createStatement(); // cria um 'cursor'

            rs = st.executeQuery("SELECT * FROM department"); //aqui ele executa a query

            while (rs.next()) { // enquanto tiver linhas/ elementos naquele resulto
                System.out.println(rs.getInt("Id") + ", " + rs.getString("Name")); //  ele vai printar, lembrando que precisa desse get e tal
            }

            rs = st.executeQuery("SELECT * FROM seller");

            while (rs.next()) {
                System.out.println(rs.getInt("Id") + ", " + rs.getString("Email") + ", " + rs.getString("BaseSalary"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatament(st);
            DB.closeConnection();
        }
    }
}
