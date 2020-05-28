package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserAuthenticationDao {
    public boolean authenticated(String name, String pwd){
        String url = "jdbc:postgresql://localhost/postgres";
        String user = "postgres";
         String password = "welcome123";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try{
            Connection conn = DriverManager.getConnection(url, user, password);

            String query = "Select * from LoginInfo where username =" + "'" +  name + "'";
            preparedStatement = conn.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                if( pwd.equals (resultSet.getString("PASSWORD")))
                    return true;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}