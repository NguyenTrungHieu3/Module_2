package ss8_clean_code.quan_ly_phuong_tien_giao_thong.entity;

public class XeTai extends PhuongTien{
    private Float trongTai;

    public XeTai(Float trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String bienKiemSoat, String hangSanXuat, Integer namSanXuat, String chuSoHuu, Float trongTai) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public Float getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(Float trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Trọng tải: "+ trongTai + " tấn" + '\n';
    }
}
