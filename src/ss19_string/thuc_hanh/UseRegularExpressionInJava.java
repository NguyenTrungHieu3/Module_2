package ss19_string.thuc_hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UseRegularExpressionInJava {
    public static void main(String[] args) {
        // Cách 1:
        Pattern p = Pattern.compile(".s");
        Matcher m = p.matcher("as");
        boolean b = m.matches();

        // Cách 2:
        boolean b2 = Pattern.compile(".s").matcher("as").matches();

        // Cách 3:
        boolean b3 = Pattern.matches(".s", "as");

        System.out.println("Java".matches("Java"));
        System.out.println("Java is fun".matches("Java.*"));
        System.out.println("Java is cool".matches("Java.*"));
        System.out.println("Java is powerful".matches("Java.*"));
    }
}
