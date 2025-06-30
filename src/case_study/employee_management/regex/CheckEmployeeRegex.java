package case_study.employee_management.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckEmployeeRegex {
    public static boolean checkEngineerId(String employeeId) {
        Pattern pattern = Pattern.compile("^KS\\d{3}$");
        Matcher matcher = pattern.matcher(employeeId);
        return matcher.matches();
    }

    public static boolean checkWorkerId(String employeeId) {
        Pattern pattern = Pattern.compile("^CN\\d{3}$");
        Matcher matcher = pattern.matcher(employeeId);
        return matcher.matches();
    }
}
