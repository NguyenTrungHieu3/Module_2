package ss17.thuc_hanh;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class TestReadObjectFile implements Serializable {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("D:\\Code_Gym_Workspace\\C0225L1\\src\\ss17\\thuc_hanh\\object.dat");
            ObjectInputStream input = new ObjectInputStream(fis);) {
            String name = input.readUTF();
            double score = input.readDouble();
            java.util.Date date = (java.util.Date) (input.readObject());
            System.out.println(name + " " + score + " " + date);
        } catch (Exception e) {
            System.out.println("Lỗi đọc file object!");
        }

    }
}
