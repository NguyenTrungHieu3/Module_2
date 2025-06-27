package ss16_io_text_file.thuc_hanh;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteTextFile {
    public static void main(String[] args) throws IOException {
            File file = new File("D:\\Code_Gym_Workspace\\C0225L1\\src\\ss16_io_text_file\\thuc_hanh\\test1.txt");
            PrintWriter output = new PrintWriter(file);
            output.print("John T Smith ");
            output.println(90);
            output.print("Eric K Jones ");
            output.println(85);
            output.close();
    }
}
