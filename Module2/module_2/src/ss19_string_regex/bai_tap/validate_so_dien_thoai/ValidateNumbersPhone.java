package ss19_string_regex.bai_tap.validate_so_dien_thoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNumbersPhone {
    private static final String NUMBERS_PHONE = "^[(][0-9]{2}[)][-][(][0][0-9]{9}[)]$";

    public boolean checkRegex(String str){
        Pattern pattern = Pattern.compile(NUMBERS_PHONE);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();

    }
}
