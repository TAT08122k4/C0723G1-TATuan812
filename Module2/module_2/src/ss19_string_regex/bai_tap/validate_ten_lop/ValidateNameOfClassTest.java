package ss19_string_regex.bai_tap.validate_ten_lop;

public class ValidateNameOfClassTest {
    private static ValidateNameOfClass validateNameOfClass;
    private static final String[] testRegex = new String[]{"C0223G", "M0318G", "P0323A", "A0323K"};

    public static void main(String[] args) {
        validateNameOfClass = new ValidateNameOfClass();
        boolean isValid;
        for (String str : testRegex) {
             isValid = validateNameOfClass.validate(str);
            System.out.println("Account is " + str + " is valid: " + isValid);
        }
    }
}
