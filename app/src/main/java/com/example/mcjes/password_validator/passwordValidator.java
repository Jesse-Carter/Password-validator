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

    public boolean check_rule3(String password) {
        int l = password.length();
        int upper = 0;
        int lower = 0;
        char[] hold=password.toCharArray();
        for (int i = 0; i < l; i++) {
            if (Character.toString(hold[i]).matches("[a-z]+"))
                lower++;
            if (Character.toString(hold[i]).matches("[A-Z]+"))
                upper++;
        }
        if (upper > 0 && lower > 0)
            return true;
        else
            return false;
    }

    public boolean check_rule4(String password) {
        int l = password.length();
        int confirmed = 0;
        char[] hold=password.toCharArray();
        for (int i = 0; i < l; i++) {
            if (Character.toString(hold[i]).matches("^[ -~]*$"))
                confirmed++;
        }
        if (confirmed > 0)
            return true;
        else
            return false;
    }

    public boolean check_rule5(String password) {
        int l=password.length();
        char[] hold=password.toCharArray();
        for(int i=0;i<l;i++){
            if(Character.toString(hold[i]).matches("[0-9]"))
                return true;
        }
        return false;
    }

    public int check_password(String password) {
        int passed = 0;
        if (check_rule1(password))
            passed++;
        if (check_rule2(password))
            passed++;
        if (check_rule3(password))
            passed++;
        if (check_rule4(password))
            passed++;
        if (check_rule5(password))
            passed++;
        return passed;
    }
}
