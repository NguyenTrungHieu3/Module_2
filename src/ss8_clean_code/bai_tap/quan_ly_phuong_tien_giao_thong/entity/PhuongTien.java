package ss8_clean_code.bai_tap.quan_ly_phuong_tien_giao_thong.entity;

public abstract class PhuongTien {
    private String bienKiemSoat;
    private String hangSanXuat;
    private Integer namSanXuat;
    private String chuSoHuu;

    public PhuongTien() {

    }

    public PhuongTien(String bienKiemSoat, String hangSanXuat, Integer namSanXuat, String chuSoHuu) {
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

    @Override
    public String toString() {
        return "Biển kiểm soát: "+ bienKiemSoat + '\n' +
                "Hãng sản xuất: "+ hangSanXuat + '\n' +
                "Năm sản xuất: "+ namSanXuat + '\n' +
                "Chủ sở hữu: "+ chuSoHuu + '\n';
    }
}
