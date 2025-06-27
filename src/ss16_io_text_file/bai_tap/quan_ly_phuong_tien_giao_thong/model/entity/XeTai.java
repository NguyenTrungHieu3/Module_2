package ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity;

public class XeTai extends PhuongTien{
    private float trongTai;

    public XeTai() {
        super();
    }

    public XeTai(float trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu,  float trongTai) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public float getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(float trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "Xe tải: " + "\n"
                + "Biển kiểm soát: " + this.getBienKiemSoat() + "\n"
                + "Tên hãng sản xuất: " + this.getTenHangSanXuat() + "\n"
                + "Năm sản xuất: " + this.getNamSanXuat() + "\n"
                + "Chủ sở hữu: " + this.getChuSoHuu() + "\n"
                + "Trọng tải: " + this.trongTai + "\n";
    }

    @Override
    public String getInfoToCSV() {
        return this.getBienKiemSoat() + ","
                + this.getTenHangSanXuat() + ","
                + this.getNamSanXuat() + ","
                + this.getChuSoHuu() + ","
                + this.trongTai;
    }
}
