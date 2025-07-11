package ss19_string.thuc_hanh;

public class ValidateAccountTest {
    public static final String[] validAccount = new String[] {"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[] {".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        ValidateAccount validateAccount = new ValidateAccount();
        for (String account : validAccount) {
            boolean isValid = validateAccount.validateAccount(account);
            System.out.println("Account is " + account + " is valid " + isValid);
        }

        for (String account : invalidAccount) {
            boolean isValid = validateAccount.validateAccount(account);
            System.out.println("Account is " + account + " is valid " + isValid);
        }
    }
}
