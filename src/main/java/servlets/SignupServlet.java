package servlets;

import model.AdminUser;
import service.SignupService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        urlPatterns = "/signup"
)
public class SignupServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AdminUser adminUser = new AdminUser();
        adminUser.setName(req.getParameter("reg_name"));
        adminUser.setReg_password(req.getParameter("reg_password"));
        adminUser.setEmail(req.getParameter("email"));
        SignupService signupService = new SignupService();
        signupService.addSignupDetails(adminUser);

    }
}
