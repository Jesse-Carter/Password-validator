package com.example.mcjes.password_validator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest extends passwordValidator {

    @Test
    public void validate_rule1() throws Exception {
        assertFalse(check_rule1("password"));
    }

    @Test
    public void validate_rule2() throws Exception {
        assertFalse(check_rule2("abcdefg"));
        assertFalse(check_rule2("a"));
        assertTrue(check_rule2("abcdefgh"));
    }
    @Test
    public void validate_rule3() throws Exception {
        assertTrue(check_rule3("ABCdef"));
    }

    @Test
    public void validate_rule4() throws Exception {
        assertTrue(check_rule4("#@#$@"));
    }

    @Test
    public void validate_rule5() throws Exception {
        assertTrue(check_rule5("1abcd"));
        assertFalse(check_rule5(("abcd")));
    }

}