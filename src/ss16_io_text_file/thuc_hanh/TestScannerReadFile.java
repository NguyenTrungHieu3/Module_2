package ss16_io_text_file.thuc_hanh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestScannerReadFile {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\Code_Gym_Workspace\\C0225L1\\src\\ss16_io_text_file\\thuc_hanh\\scores.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String firstName = sc.next();
                String middleName = sc.next();
                String lastName = sc.next();
                int score = sc.nextInt();
                System.out.println(firstName + " " + middleName + " " + lastName + " " + score);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
