package com.example.mcjes.password_validator;

/**
 * Created by mcjes on 2017-05-25.
 */

public class passwordValidator {

    public boolean check_rule1(String password) {
        if (password.equals("password"))
            return false;
        else
            return true;
    }

    public boolean check_rule2(String password) {
        if (password.length() < 8)
            return false;
        else
            return true;
    }
}
