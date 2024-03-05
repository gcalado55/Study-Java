package Application;

import Db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Progam {
    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement pst = null;
        Scanner sc = new Scanner(System.in);

        try {
            connection = DB.getConnection();

            pst = connection.prepareStatement("UPDATE seller " +
                    "SET BaseSalary = BaseSalary + ? " +
                    "WHERE " +
                    "(DepartmentId = ?)");

            System.out.print("Ammount to be added to salary = ");
            pst.setDouble(1, sc.nextDouble());
            pst.setInt(2, 2);

            int rowsAffected = pst.executeUpdate();

            System.out.println("Done! Rows affected: " + rowsAffected);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(pst);
            DB.closeConnection();
        }


    }
}