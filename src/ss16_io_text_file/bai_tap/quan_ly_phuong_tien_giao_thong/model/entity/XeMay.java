package ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity;

public class XeMay extends PhuongTien{
    private int congSuat;

    public XeMay() {
        super();
    }

    public XeMay(int congSuat) {
        super();
        this.congSuat = congSuat;
    }

    public XeMay(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu,  int congSuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "Xe máy: " + "\n"
                + "Biển kiểm soát: " + this.getBienKiemSoat() + "\n"
                + "Tên hãng sản xuất: " + this.getTenHangSanXuat() + "\n"
                + "Năm sản xuất: " + this.getNamSanXuat() + "\n"
                + "Chủ sở hữu: " + this.getChuSoHuu() + "\n"
                + "Công suất: " + this.congSuat + "\n";
    }

    @Override
    public String getInfoToCSV() {
        return this.getBienKiemSoat() + ","
                + this.getTenHangSanXuat() + ","
                + this.getNamSanXuat() + ","
                + this.getChuSoHuu() + ","
                + this.congSuat;
    }
}
