package ss19_string.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    public static boolean validateClassName(String className) {
        Pattern pattern = Pattern.compile("^[CAP]\\d{4}[GHIK]$");
        Matcher matcher = pattern.matcher(className);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] validClassName = new String[] {"C0223G", "A0323K"};
        String[] invalidClassName = new String[] {"M0318G", "P0323A"};
        for (String className : validClassName) {
            System.out.println("Class name " + className + " is valid? " + validateClassName(className));
        }

        for (String className : invalidClassName) {
            System.out.println("Class name " + className + " is valid? " + validateClassName(className));
        }
    }
}
