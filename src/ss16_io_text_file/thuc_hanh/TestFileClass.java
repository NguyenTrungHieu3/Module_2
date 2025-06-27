package ss16_io_text_file.thuc_hanh;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestFileClass {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Code_Gym_Workspace\\C0225L1\\src\\ss16_io_text_file\\thuc_hanh\\foo.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println("Hello World");
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File not exists");
        }
    }
}
