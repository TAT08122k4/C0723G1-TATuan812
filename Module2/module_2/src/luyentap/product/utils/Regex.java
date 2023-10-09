package luyentap.product.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String CHECK_IDPRODUCT = "ID-([0-9]{4})";

    public boolean checkIdProduct(String idProduct){
        Pattern pattern = Pattern.compile(CHECK_IDPRODUCT);
        Matcher matcher = pattern.matcher(idProduct);
        return matcher.matches();
    }
}
