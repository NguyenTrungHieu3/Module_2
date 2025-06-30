package ss19_string.thuc_hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String EMAIL_REGEX = "^[A-Za-z0-9.%+-]+@[A-Za-z0-9.-]+(\\.[A-Za-z]{2,})+$";
    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("^[A-Za-z0-9.%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}$");
        Pattern pattern = Pattern.compile("^[A-Za-z0-9.%+-]+@[A-Za-z0-9.-]+(\\.[A-Za-z]{2,})+$");
    }

    public ValidateEmail() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validateEmail(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
