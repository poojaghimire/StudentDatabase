package dao;

import model.AdminUser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UserAdministratorDao {
    public void addSignupDetailsToDb(AdminUser adminUser) {
        String url = "jdbc:postgresql://localhost/postgres";
        String user = "postgres";
        String password = "welcome123";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            String insert = "INSERT INTO Logininfo (username,password,email)  VALUES (" +
                    "'" + adminUser.getName() + "'," +
                    "'" + adminUser.getReg_password() + "'," +
                    "'" + adminUser.getEmail() + "')";

            stmt.execute(insert);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



