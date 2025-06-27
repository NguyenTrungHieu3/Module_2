package ss16_io_text_file.thuc_hanh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadTextFile {
    public static void main(String[] args) {
        try {
            File inFile = new File("D:\\Code_Gym_Workspace\\C0225L1\\src\\ss16_io_text_file\\thuc_hanh\\test.csv");
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
