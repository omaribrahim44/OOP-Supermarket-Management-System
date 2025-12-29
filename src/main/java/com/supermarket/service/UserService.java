package com.supermarket.service;

import com.supermarket.dao.UserDAO;
import com.supermarket.model.User;

public class UserService {

    private UserDAO userDAO;

    public UserService() {
        this.userDAO = new UserDAO();
    }

    public boolean registerUser(User user) {
        return userDAO.registerUser(user);
    }

    public boolean loginUser(String username, String password) {
        return userDAO.validateUser(username, password);
    }
}
