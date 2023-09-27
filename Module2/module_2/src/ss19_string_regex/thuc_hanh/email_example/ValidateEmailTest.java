package ss19_string_regex.thuc_hanh.email_example;

public class ValidateEmailTest {
    private static ValidateEmail validateEmail;
    public static final String[] validEmail = new String[]{"a@gmail.com","ab@yahoo.com","abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com","ab@gmail.","@#abc@gmail.com"};

    public static void main(String[] args) {
        validateEmail = new ValidateEmail();
        for (String email : validEmail){
            boolean isValid = validateEmail.valitate(email);
            System.out.println("Email is " + email + " is valid " + isValid);
        }
        for (String email : invalidEmail){
            boolean isvalid = validateEmail.valitate(email);
            System.out.println("Email is " + email + " is valid: " + isvalid);
        }
    }
}
