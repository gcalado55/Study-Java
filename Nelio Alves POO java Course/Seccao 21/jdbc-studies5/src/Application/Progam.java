package Application;

import Db.DB;
import Db.DbIntegrityException;

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

            pst = connection.prepareStatement("DELETE FROM department " +
                    "WHERE " +
                    "Id = ?");

            System.out.print("Id to delete = ");
            pst.setInt(1, sc.nextInt());

            int rowsAffected = pst.executeUpdate();

            System.out.println("Done! Rows affected: " + rowsAffected);
        }
        catch (SQLException e){
            throw new DbIntegrityException(e.getMessage());
        }
        finally {
            DB.closeStatement(pst);
            DB.closeConnection();
        }


    }
}