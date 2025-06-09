package ss8_clean_code.quan_ly_phuong_tien.view;

import java.util.Scanner;

public class RemoveVehicleView {
    public static String displayRemoveVehicleView() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập biển số xe muốn xóa: ");
        return sc.nextLine();
    }
}
