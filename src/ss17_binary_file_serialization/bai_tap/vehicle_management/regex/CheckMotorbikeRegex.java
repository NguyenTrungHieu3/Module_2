package ss17_binary_file_serialization.bai_tap.vehicle_management.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckMotorbikeRegex {
    public static boolean checkMotorbikeID(String vehicleID) {
        Pattern pattern = Pattern.compile("^\\d{2}[A-Z]{1}\\d{1}-\\d{3}\\.d{2}$");
        Matcher matcher = pattern.matcher(vehicleID);
        return matcher.matches();
    }
}
