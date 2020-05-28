package servlets;

import model.Student;
import service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(
       urlPatterns = "/pooja"
)
public class StudentDetailServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
/*        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String gender = req.getParameter("gender");
        String dob = req.getParameter("dob");
        String contact = req.getParameter("contact");*/
        String dob = req.getParameter("dob");

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        //Parsing the given String to Date object
        Date date = null;
        try {
            date = formatter.parse(dob);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Student student = new Student();
        student.setId(req.getParameter("id"));
        student.setName(req.getParameter("name"));
        student.setEmail(req.getParameter("email"));
        student.setGender(req.getParameter("gender"));
        student.setDob(date);
        student.setContact(req.getParameter("contact"));

        StudentService studentService = new StudentService();
        studentService.addStudentDetails(student);

    }
}
