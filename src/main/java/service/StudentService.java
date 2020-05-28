package service;

import dao.StudentDao;
import model.Student;

public class StudentService {
    public void addStudentDetails(Student student){
            StudentDao studentDao = new StudentDao();
            studentDao.addStudentDetailsToDb(student);
    }
}
