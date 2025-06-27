package ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.view;

import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity.OTo;
import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity.XeMay;
import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity.XeTai;

import java.util.Scanner;

public class AddNewVehicleView {
    public static int displayAddNewVehicleMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------- VUI LÒNG CHỌN LOẠI XE MUỐN THÊM --------------------");
        System.out.println("1. Thêm xe tải");
        System.out.println("2. Thêm ô tô");
        System.out.println("3. Thêm xe máy");
        System.out.println("4. Quay lại menu chính");
        System.out.println("Mời bạn nhập lựa chọn: ");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }

    public static OTo inputOTo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập biển kiểm soát: ");
        String bienKiemSoat = sc.nextLine();
        System.out.println("Nhập tên hãng sản xuất: ");
        String tenHangSanXuat = sc.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        int namSanXuat = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập chủ sở hữu: ");
        String chuSoHuu = sc.nextLine();
        System.out.println("Nhập số chỗ ngồi: ");
        int soChoNgoi = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập kiểu xe: ");
        String kieuXe = sc.nextLine();
        return new OTo(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu, soChoNgoi, kieuXe);
    }

    public static XeTai inputXeTai() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập biển kiểm soát: ");
        String bienKiemSoat = sc.nextLine();
        System.out.println("Nhập tên hãng sản xuất: ");
        String tenHangSanXuat = sc.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        int namSanXuat = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập chủ sở hữu: ");
        String chuSoHuu = sc.nextLine();
        System.out.println("Nhập trọng tải: ");
        float trongTai = Float.parseFloat(sc.nextLine());
        return new XeTai(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu, trongTai);
    }

    public static XeMay inputXeMay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập biển kiểm soát: ");
        String bienKiemSoat = sc.nextLine();
        System.out.println("Nhập tên hãng sản xuất: ");
        String tenHangSanXuat = sc.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        int namSanXuat = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập chủ sở hữu: ");
        String chuSoHuu = sc.nextLine();
        System.out.println("Nhập công suất: ");
        int congSuat = Integer.parseInt(sc.nextLine());
        return new XeMay(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu, congSuat);
    }
}
