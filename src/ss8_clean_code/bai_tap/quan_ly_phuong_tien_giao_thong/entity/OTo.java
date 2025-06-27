package ss8_clean_code.bai_tap.quan_ly_phuong_tien_giao_thong.entity;

public class OTo extends PhuongTien {
    private Integer soChoNgoi;
    private String kieuXe;

    public OTo() {

    }

    public OTo(Integer soChoNgoi, String kieuXe) {
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public OTo(String bienKiemSoat, String hangSanXuat, Integer namSanXuat, String chuSoHuu, Integer soChoNgoi, String kieuXe) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public Integer getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(Integer soChoNgoi) {
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
        return super.toString() +
                "Số chỗ ngồi: "+ soChoNgoi + '\n' +
                "Kiểu xe: "+ kieuXe + '\n';
    }
}
