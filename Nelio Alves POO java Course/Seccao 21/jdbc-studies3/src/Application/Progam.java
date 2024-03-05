package Application;

import Db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Progam {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection connection = null;
        PreparedStatement pst = null;

        try {
            connection = DB.getConnection();

            pst = connection.prepareStatement(
                    "INSERT INTO seller " +
                            "(Name, Email, BirthDate, BaseSalary, DepartmentId) " +
                            "VALUES " +
                            "(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);

            pst.setString(1, "Gabriel Calado");
            pst.setString(2, "gcalado501@gmail.com");
            pst.setDate(3, new Date(sdf.parse("03/05/2024").getTime()));
            pst.setDouble(4, 3000.0);
            pst.setInt(5, 4);

            int rowsAffected = pst.executeUpdate();

            if(rowsAffected > 0){
                ResultSet rs = pst.getGeneratedKeys();
                while (rs.next()){
                    int id  = rs.getInt(1);
                    System.out.println("Done! Id = " + id);
                }
            }
            else {
                System.out.println("No rows affected!");
            }

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(pst);
            DB.closeConnection();
        }

    }
}