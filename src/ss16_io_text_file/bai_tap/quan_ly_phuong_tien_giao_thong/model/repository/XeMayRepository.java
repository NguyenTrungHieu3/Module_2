package ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.repository;

import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity.XeMay;
import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class XeMayRepository implements IXeMayRepository{
    private final String MORTOBIKES_PATH = "D:\\Code_Gym_Workspace\\C0225L1\\src\\ss16_io_text_file\\bai_tap\\quan_ly_phuong_tien_giao_thong\\data\\motorbikes.csv";
    private final boolean APPEND = true;

    @Override
    public void addXeMay(XeMay xeMay) {
        List<String> stringList = new ArrayList<>();
        stringList.add(xeMay.getInfoToCSV());
        ReadAndWriteFile.writeListToCSV(MORTOBIKES_PATH, stringList, APPEND);
    }

    @Override
    public List<XeMay> findAllXeMay() {
        List<String> stringList = ReadAndWriteFile.readFileCSV(MORTOBIKES_PATH);
        List<XeMay> xeMayList = new ArrayList<>();
        String[] array = null;
        for (String line : stringList) {
            array = line.split(",");
            XeMay xeMay = new XeMay(array[0], array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4]));
            xeMayList.add(xeMay);
        }
        return xeMayList;
    }

    @Override
    public boolean deleteXeMayById(String bienSo) {
        boolean isDeleted = false;
        List<XeMay> xeMayList = findAllXeMay();
        List<String> stringList = new ArrayList<>();
        for (XeMay xeMay : xeMayList) {
            if (xeMay.getBienKiemSoat().equals(bienSo)) {
                xeMayList.remove(xeMay);
                isDeleted = true;
            }
        }
        for (XeMay xeMay : xeMayList) {
            stringList.add(xeMay.getInfoToCSV());
        }
        ReadAndWriteFile.writeListToCSV(MORTOBIKES_PATH, stringList, !APPEND);
        return isDeleted;
    }
}
