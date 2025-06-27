package ss16_io_text_file.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCSV {
    public static void readFile(String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException(fileName);
        }

        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            String line = null;
            while ((line = br.readLine()) != null) {
                printCSV(parseToCSV(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> parseToCSV(String csvline) {
        List<String> result = new ArrayList<>();
        if (csvline != null) {
            String[] csvLine = csvline.split(",");
            for (int i = 0; i < csvLine.length; i++) {
                result.add(csvLine[i]);
            }
        }
        return result;
    }

    public static void printCSV(List<String> listCSV) {
        System.out.println("Country: " + "\n" +
                            "id = " + listCSV.get(0) + "\n" +
                            "code = " + listCSV.get(1) + "\n" +
                            "name = " + listCSV.get(2) + "\n");

    }

    public static void main(String[] args) {
        try {
            readFile("D:\\Code_Gym_Workspace\\C0225L1\\src\\ss16_io_text_file\\bai_tap\\countries.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
