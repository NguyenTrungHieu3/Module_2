package ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.repository;

import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity.XeTai;
import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class XeTaiRepository implements IXeTaiRepository{
    private String TRUCKS_PATH = "D:\\Code_Gym_Workspace\\C0225L1\\src\\ss16_io_text_file\\bai_tap\\quan_ly_phuong_tien_giao_thong\\data\\trucks.csv";
    private boolean APPEND = true;

    @Override
    public void addXeTai(XeTai xeTai) {
        List<String> stringList = new ArrayList<>();
        stringList.add(xeTai.getInfoToCSV());
        ReadAndWriteFile.writeListToCSV(TRUCKS_PATH, stringList, APPEND);
    }

    @Override
    public List<XeTai> findAllXeTai() {
        List<String> stringList = ReadAndWriteFile.readFileCSV(TRUCKS_PATH);
        List<XeTai> xeTaiList = new ArrayList<>();
        String[] array = null;
        for (String line : stringList) {
            array = line.split(",");
            XeTai xeTai = new XeTai(array[0], array[1], Integer.parseInt(array[2]), array[3], Float.parseFloat(array[4]));
            xeTaiList.add(xeTai);
        }
        return xeTaiList;
    }

    @Override
    public boolean deleteXeTaiById(String bienSo) {
        boolean isDeleted = false;
        List<XeTai> xeTaiList = findAllXeTai();
        List<String> stringList = new ArrayList<>();
        for (XeTai xeTai : xeTaiList) {
            if (xeTai.getBienKiemSoat().equals(bienSo)) {
                xeTaiList.remove(xeTai);
                isDeleted = true;
                break;
            }
        }
        for (XeTai xeTai : xeTaiList) {
            stringList.add(xeTai.getInfoToCSV());
        }
        ReadAndWriteFile.writeListToCSV(TRUCKS_PATH, stringList, !APPEND);
        return isDeleted;
    }
}
