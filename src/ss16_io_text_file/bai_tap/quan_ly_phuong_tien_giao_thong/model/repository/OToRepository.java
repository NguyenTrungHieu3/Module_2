package ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.repository;

import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity.OTo;
import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class OToRepository implements IOToRepository {
    private final boolean APPEND = true;
    private final String CARS_PATH = "D:\\Code_Gym_Workspace\\C0225L1\\src\\ss16_io_text_file\\bai_tap\\quan_ly_phuong_tien_giao_thong\\data\\cars.csv";

    @Override
    public void addOTo(OTo oTo) {
        List<String> stringList = new ArrayList<>();
        stringList.add(oTo.getInfoToCSV());
        ReadAndWriteFile.writeListToCSV(CARS_PATH, stringList, APPEND);
    }

    @Override
    public List<OTo> findAllOTo() {
        List<String> stringList = ReadAndWriteFile.readFileCSV(CARS_PATH);
        List<OTo> oToList = new ArrayList<>();
        String[] array = null;
        for (String line : stringList) {
            array = line.split(",");
            OTo oTo = new OTo(array[0], array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4]), array[5]);
            oToList.add(oTo);
        }
        return oToList;
    }

    @Override
    public boolean deleteOToById(String bienSo) {
        boolean isDeleted = false;
        List<OTo> otoList = findAllOTo();
        for (OTo oTo : otoList) {
            if (oTo.getBienKiemSoat().equals(bienSo)) {
                isDeleted = true;
                otoList.remove(oTo);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (OTo oTo : otoList) {
            stringList.add(oTo.getInfoToCSV());
        }
        ReadAndWriteFile.writeListToCSV(CARS_PATH, stringList, !APPEND);
        return isDeleted;
    }
}
