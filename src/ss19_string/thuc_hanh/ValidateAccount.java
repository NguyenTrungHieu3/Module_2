package ss19_string.thuc_hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
    private static String ACCOUNT_REGEX = "^[a-z_0-9]{6,}";

    public ValidateAccount() {

    }

    public boolean validateAccount(String account) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(account);
        return matcher.matches();
    }
}
