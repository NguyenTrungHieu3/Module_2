package case_study.validate;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationUtils {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9.%+-]+@[A-Za-z0-9.-]+(\\.[A-Za-z]{2,})+$";
    private static final String PHONE_REGEX = "^0\\d{9}$";
    private static final String BIRTHDAY_REGEX = "^\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}$";
    private static final String OFFICIAL_STUDENT_ID_REGEX = "^OS\\d{3}$";
    private static final String TRIAL_STUDENT_ID_REGEX = "^TS\\d{3}$";

    public static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean isValidPhone(String phone) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }

    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static boolean isValidBirthDay(String birthDay) {
        try {
            LocalDate birthDate = LocalDate.parse(birthDay, DATE_FORMAT);
            LocalDate today = LocalDate.now();

            // Ngày sinh phải trước ngày hiện tại
            if (birthDate.isAfter(today)) {
                return false;
            }

            // Tuổi phải >= 18
            int age = Period.between(birthDate, today).getYears();
            return age >= 18;
        } catch (DateTimeParseException e) {
            return false; // Định dạng không đúng hoặc lỗi parse
        }
    }

    public static boolean isValidOfficalStudentId(String officalStudentId) {
        Pattern pattern = Pattern.compile(OFFICIAL_STUDENT_ID_REGEX);
        Matcher matcher = pattern.matcher(officalStudentId);
        return matcher.matches();
    }

    public static boolean isValidTrialStudentId(String trialStudentId) {
        Pattern pattern = Pattern.compile(TRIAL_STUDENT_ID_REGEX);
        Matcher matcher = pattern.matcher(trialStudentId);
        return matcher.matches();
    }

    public static boolean isValidTrialDays(int trialDays) {
        try {
            return trialDays > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
