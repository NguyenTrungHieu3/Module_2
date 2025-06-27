package ss16_io_text_file.thuc_hanh;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteDataWithAutoClose {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Code_Gym_Workspace\\C0225L1\\src\\ss16_io_text_file\\thuc_hanh\\scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }

        try (PrintWriter output = new PrintWriter(file)) {
            output.print("John T Smith ");
            output.println(90);
            output.print("Eric T Smith ");
            output.println(85);
        }
    }
}
