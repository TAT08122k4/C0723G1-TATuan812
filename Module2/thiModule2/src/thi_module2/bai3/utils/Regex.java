package thi_module2.bai3.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String MA_HOA_DON = "MHD-[0-9]{4}";


    public static boolean kiemTraMaHoaDon(String maHoaDon) {
        Pattern pattern = Pattern.compile(MA_HOA_DON);
        Matcher matcher = pattern.matcher(maHoaDon);
        return matcher.matches();
    }

}
