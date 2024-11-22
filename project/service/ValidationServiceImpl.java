package main.project.service;

public class ValidationServiceImpl implements ValidationService {

    @Override
    public boolean validateUserName(String userName) {
        return userName != null && userName.matches("[a-zA-Z0-9_]{5,15}");
    }

    @Override
    public boolean validatePassword(String password) {
        return password != null && password.length() >= 8;
    }
}
