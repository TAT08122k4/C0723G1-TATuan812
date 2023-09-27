package ss19_string_regex.thuc_hanh.validate_account;



public class ValidateAccountTest {
    private static ValidateAcount validateAcount;
    public static final String[] validAccountTest = new String[]{"123abc_","_abc123","123456","abcdefghrwdasdas"};
    public static final String[] invalidAccountTest = new String[]{".@","12345","1234_","abcde"};

    public static void main(String[] args) {
        validateAcount = new ValidateAcount();
        for (String account : validAccountTest){
            boolean isValid = validateAcount.validate(account);
            System.out.println("Account is " + account + " is valid: " + isValid);
        }
        for (String account : invalidAccountTest){
            boolean isValid = validateAcount.validate(account);
            System.out.println("Account is " + account + " is valid : " + isValid);
        }
    }
}
