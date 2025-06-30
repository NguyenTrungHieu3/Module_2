package ss19_string.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static boolean validatePhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile("\\(\\d{2}\\)-\\(0\\d{9}\\)");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] validPhoneNummbers = new String[] {"(84)-(0978489648)"};
        String[] inValidPhoneNummbers = new String[] {"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};
        for (String phoneNumber : validPhoneNummbers) {
            System.out.println("Phone Number : " + phoneNumber + " is valid? " + validatePhoneNumber(phoneNumber));
        }
        for (String phoneNumber : inValidPhoneNummbers) {
            System.out.println("Phone Number : " + phoneNumber + " is valid? " + validatePhoneNumber(phoneNumber));
        }
    }
}
