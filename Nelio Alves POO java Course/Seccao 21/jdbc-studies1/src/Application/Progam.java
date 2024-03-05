package Application;

import Db.DB;
import java.sql.Connection;

public class Progam {
    public Progam() {
    }

    public static void main(String[] args) {
        Connection conn = DB.getConnection();
        DB.closeConnection();
    }
}