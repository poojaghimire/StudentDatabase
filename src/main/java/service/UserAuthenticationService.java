package service;

import dao.UserAuthenticationDao;

public class UserAuthenticationService {
    public boolean authenticateUser(String name, String password){
        //make call to dao method
        UserAuthenticationDao userAuthenticationDao = new UserAuthenticationDao();
        return userAuthenticationDao.authenticated(name,password);
    }
}
