package service;

import dao.UserAdministratorDao;
import model.AdminUser;

public class SignupService {
    public void addSignupDetails(AdminUser adminUser){
        UserAdministratorDao userAdministratorDao  = new UserAdministratorDao();
        userAdministratorDao.addSignupDetailsToDb(adminUser);
    }
}
