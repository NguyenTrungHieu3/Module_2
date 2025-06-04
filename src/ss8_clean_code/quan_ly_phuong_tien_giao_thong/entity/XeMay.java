package ss8_clean_code.quan_ly_phuong_tien_giao_thong.entity;

public class XeMay extends PhuongTien{
    private Integer congSuat;

    public XeMay(Integer congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay(String bienKiemSoat, String hangSanXuat, Integer namSanXuat, String chuSoHuu, Integer congSuat) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public Integer getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(Integer congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Trọng tải: "+ congSuat + " cc" + '\n';
    }
}
