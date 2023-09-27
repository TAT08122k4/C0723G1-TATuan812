package ss19_string_regex.thuc_hanh.validate_account;

import ss19_string_regex.thuc_hanh.email_example.ValidateEmail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAcount {
    private static final String ACCOUNT_REGEX = "[_a-z0-9]{6,}$";
    public ValidateAcount(){

    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
