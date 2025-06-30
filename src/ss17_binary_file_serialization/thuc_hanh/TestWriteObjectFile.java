package ss17_binary_file_serialization.thuc_hanh;

import java.io.*;

public class TestWriteObjectFile implements Serializable {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\Code_Gym_Workspace\\C0225L1\\src\\ss17\\thuc_hanh\\object.dat");
        try(ObjectOutputStream output = new ObjectOutputStream(fos);) {
            output.writeUTF("John Smith");
            output.writeDouble(85.5);
            output.writeObject(new java.util.Date());
        } catch (IOException e) {
            System.out.println("Lỗi ghi đối tượng!");
        }
    }
}
