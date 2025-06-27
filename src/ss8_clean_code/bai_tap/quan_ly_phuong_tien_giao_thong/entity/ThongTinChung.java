package ss8_clean_code.bai_tap.quan_ly_phuong_tien_giao_thong.entity;

import java.util.Scanner;

public class ThongTinChung {
    private String bienKiemSoat;
    private String hangSanXuat;
    private Integer namSanXuat;
    private String chuSoHuu;

    public ThongTinChung() {

    }

    public ThongTinChung(String bienKiemSoat, String hangSanXuat, Integer namSanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public Integer getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(Integer namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    public static ThongTinChung nhapThongTinChung() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập biển kiểm soát: ");
        String bienKiemSoat = sc.nextLine();

        System.out.println("Nhập tên hãng sản xuất: ");
        String tenHang = sc.nextLine();

        System.out.println("Nhập năm sản xuất: ");
        int namSanXuat = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập chủ sở hữu: ");
        String chuSoHuu = sc.nextLine();
        return new ThongTinChung(bienKiemSoat, tenHang, namSanXuat, chuSoHuu);
    }
}
