package ss16_io_text_file.thuc_hanh;

import java.util.ArrayList;
import java.util.List;

public class FindMaxValue {
    public static int findMaxValue(List<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\Code_Gym_Workspace\\C0225L1\\src\\ss16_io_text_file\\thuc_hanh\\numbers.txt");
        int maxValue = findMaxValue(numbers);
        readAndWriteFile.writeFile("D:\\Code_Gym_Workspace\\C0225L1\\src\\ss16_io_text_file\\thuc_hanh\\result.txt", maxValue);
    }
}
