package ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void writeListToCSV(String filePath, List<String> stringList, boolean append) {
        File file = new File(filePath);
        try (FileWriter fileWriter = new FileWriter(file, append);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);) {
            for (String line : stringList) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file!");
        }
    }

    public static List<String> readFileCSV(String filePath) {
        List<String> stringList = new ArrayList<String>();
        File file = new File(filePath);
        try (FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file!");
        }
        return stringList;
    }
}
