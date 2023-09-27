package ss19_string_regex.bai_tap.validate_so_dien_thoai;

public class ValidateNumbersPhoneTest {
    private static ValidateNumbersPhone validateNumbersPhone;
    private static final String[] str = new String[]{"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(0978489648)", "(84)-(9978489648)"};

    public static void main(String[] args) {
        validateNumbersPhone = new ValidateNumbersPhone();
        boolean isValid;
        for (String str : str){
            isValid = validateNumbersPhone.checkRegex(str);
            System.out.println("Numbers is " + str + " is valid: " + isValid);

        }
    }
}
