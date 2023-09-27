package ss19_string_regex.bai_tap.validate_ten_lop;

import ss19_string_regex.thuc_hanh.email_example.ValidateEmail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameOfClass {
    private static final String NAME_OF_CLASS = "^([C|A|P])([0-9]){4}([G|H|I|K])$";
    public ValidateNameOfClass(){

    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(NAME_OF_CLASS);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
