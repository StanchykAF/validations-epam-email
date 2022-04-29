package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EpamEmailValidation {

    public static boolean validateEpamEmail(String email) {
        if (email == null) {
            return false;
        }
        Pattern patternValidEmail = Pattern.compile("(\\w+)_(\\w+)(@epam.com)");
        Matcher matcherValidEmail = patternValidEmail.matcher(email);
        return matcherValidEmail.matches();
    }
}





