package dao;

import model.Student;

import java.sql.*;

public class StudentDao {
    public void addStudentDetailsToDb(Student student){
        String url = "jdbc:postgresql://localhost/postgres";
        String user = "postgres";
        String password = "welcome123";

        try{
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            String insert = "INSERT INTO STUDENT (id,name,email,dob,gender,contact)  VALUES (" +
                    "'"+student.getId()+"',"+
                    "'"+student.getName()+"',"+
                    "'"+student.getEmail()+"',"+
                    "'"+student.getDob()+"',"+
                    "'"+student.getGender()+"',"+
                    "'"+student.getContact()+"')";
            stmt.execute(insert);

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
