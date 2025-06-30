package ss19_string.thuc_hanh;

public class ValidateEmailTest {
    private static ValidateEmail validateEmail;
    public static String[] validEmail = new String[] {"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static String[] invalidEmail = new String[] {"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        validateEmail = new ValidateEmail();
        for (String email : validEmail) {
            boolean isValid = validateEmail.validateEmail(email);
            System.out.println("Email is " + email + " is valid? " + isValid);
        }

        for (String email : invalidEmail) {
            boolean isValid = validateEmail.validateEmail(email);
            System.out.println("Email is " + email + " is valid? " + isValid);
        }
    }
}
