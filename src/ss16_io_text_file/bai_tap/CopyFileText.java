package ss16_io_text_file.bai_tap;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class CopyFileText {
    public static void copyFile(String src, String dest) throws IOException {
        File scrFile = new File(src);
        if (!scrFile.exists()) {
            throw new FileNotFoundException("File not found: " + scrFile);
        }

        File destFile = new File(dest);
        if (destFile.exists()) {
            throw new FileAlreadyExistsException("File already exists" + destFile);
        }

        int numOfchars = 0;
        try (FileReader fr = new FileReader(scrFile);
            FileWriter fw = new FileWriter(destFile);
            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw);) {
            int result;
            while ((result = br.read()) != -1) {
                fw.write(result);
                numOfchars++;
            }
            System.out.println("Read file completed: " + numOfchars);
        } catch (IOException e) {
            System.out.println("Error while reading file: " + scrFile);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            copyFile("D:\\Code_Gym_Workspace\\C0225L1\\src\\ss16_io_text_file\\thuc_hanh\\numbers.txt", "D:\\Code_Gym_Workspace\\C0225L1\\src\\ss16_io_text_file\\thuc_hanh\\result.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
