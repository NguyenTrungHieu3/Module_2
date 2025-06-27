package ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity;

public class OTo extends PhuongTien{
    private int soChoNgoi;
    private String kieuXe;

    public OTo() {
        super();
    }

    public OTo(int soChoNgoi, String loaiXe) {
        super();
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = loaiXe;
    }

    public OTo(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, int soChoNgoi, String loaiXe) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = loaiXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "Ô tô: " + "\n"
                + "Biển kiểm soát: " + this.getBienKiemSoat() + "\n"
                + "Tên hãng sản xuất: " + this.getTenHangSanXuat() + "\n"
                + "Năm sản xuất: " + this.getNamSanXuat() + "\n"
                + "Chủ sở hữu: " + this.getChuSoHuu() + "\n"
                + "Số chỗ ngồi: " + this.soChoNgoi + "\n"
                + "Kiểu xe: " + this.kieuXe + "\n";
    }

    @Override
    public String getInfoToCSV() {
        return this.getBienKiemSoat() + ","
                + this.getTenHangSanXuat() + ","
                + this.getNamSanXuat() + ","
                + this.getChuSoHuu() + ","
                + this.soChoNgoi + ","
                + this.kieuXe;
    }
}
