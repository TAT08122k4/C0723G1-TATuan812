package luyentap.vephim.utils;

import ss10_stack_queue.bai_tap.Palindrome;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String MA_VE = "^MV-([0-9]{4})$";

    public static boolean kiemTraMaVe(String maVe){
        Pattern pattern = Pattern.compile(MA_VE);
        Matcher matcher = pattern.matcher(maVe);
        return matcher.matches();
    }
}
