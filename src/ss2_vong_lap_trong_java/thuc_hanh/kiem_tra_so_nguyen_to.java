package ss2_vong_lap_trong_java.thuc_hanh;

public class kiem_tra_so_nguyen_to {
    public static void main(String[] args) {
        System.out.println(kiemTraSoNguyenTo(4));
    }

    public static boolean kiemTraSoNguyenTo(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if ((a%i) == 0) {
                return false;
            }
        }
        return true;
    }
}


