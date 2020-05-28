import service.UserAuthenticationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        urlPatterns =  "/login"
)
public class LoginServlet extends HttpServlet{


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("pwd");

        // make object of UserAuthenticationService and call it
        UserAuthenticationService userAuthenticationService = new UserAuthenticationService();

        boolean isUserValid = userAuthenticationService.authenticateUser(name,password);
        PrintWriter out = resp.getWriter();

        if(!isUserValid){
            out.println("Invalid creds");
            //req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);
        }
        else{
            req.getRequestDispatcher("/WEB-INF/student.jsp").forward(req, resp);
        }

    }
}
