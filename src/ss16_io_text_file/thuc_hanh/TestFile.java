package ss16_io_text_file.thuc_hanh;

public class TestFile {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("D:\\Code_Gym_Workspace\\C0225L1\\src\\ss16_io_text_file\\thuc_hanh\\test.csv");
        System.out.println("Does it exist? " + file.exists());
        System.out.println("The file has " + file.length() + " bytes");
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written? " + file.canWrite());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("Is it a file? " + file.isFile());
        System.out.println("Is it absolute? " + file.isAbsolute());
        System.out.println("Is it hidden? " + file.isHidden());
        System.out.println("Absolute path is " + file.getAbsolutePath());
        System.out.println("Last modified time is " + file.lastModified());
    }
}
