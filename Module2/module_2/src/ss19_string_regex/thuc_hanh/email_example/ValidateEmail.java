package ss19_string_regex.thuc_hanh.email_example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_REGEX ="^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public ValidateEmail(){
        pattern = Pattern.compile(EMAIL_REGEX);
    }
    public  boolean valitate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public static void main(String[] args) {
    }
}


