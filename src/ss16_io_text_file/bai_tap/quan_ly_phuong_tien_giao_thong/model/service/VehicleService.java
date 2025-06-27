package ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.service;

import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity.OTo;
import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity.PhuongTien;
import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity.XeMay;
import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity.XeTai;
import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.repository.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleService implements IVehicleService {
    private IOToRepository oToRepository = new OToRepository();
    private IXeTaiRepository xeTaiRepository = new XeTaiRepository();
    private IXeMayRepository xeMayRepository = new XeMayRepository();
    private final int YES = 1;
    private final int NO = 2;

    @Override
    public void addOTo(OTo oTo) {
        oToRepository.addOTo(oTo);
    }

    @Override
    public void addXeMay(XeMay xeMay) {
        xeMayRepository.addXeMay(xeMay);
    }

    @Override
    public void addXeTai(XeTai xeTai) {
        xeTaiRepository.addXeTai(xeTai);
    }

    @Override
    public List<OTo> findAllOTo() {
        return oToRepository.findAllOTo();
    }

    @Override
    public List<XeTai> findAllXeTai() {
        return xeTaiRepository.findAllXeTai();
    }

    @Override
    public List<XeMay> findAllXeMay() {
        return xeMayRepository.findAllXeMay();
    }

    @Override
    public List<PhuongTien> findAllPhuongTien() {
        List<PhuongTien> list = new ArrayList<>();
        list.addAll(findAllOTo());
        list.addAll(findAllXeMay());
        list.addAll(findAllXeTai());
        return list;
    }

    @Override
    public boolean deleteVehicleById(String bienSo) {
        Scanner sc = new Scanner(System.in);
        PhuongTien phuongTien = checkExistVehicle(bienSo);
        if (phuongTien == null) {
            System.out.println("Không tìm thấy phương tiện với biển kiểm soát: " + bienSo);
            return false;
        }

        System.out.println("Bạn có chắc chắc muốn xóa xe có biển số: " + bienSo);
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println("Mời bạn nhập lựa chọn: ");
        int choice = Integer.parseInt(sc.nextLine());

        if (choice == YES) {
            boolean isDeleted = false;
            if (phuongTien instanceof XeTai) {
                return xeTaiRepository.deleteXeTaiById(bienSo);
            } else if (phuongTien instanceof XeMay) {
                return xeMayRepository.deleteXeMayById(bienSo);
            } else if (phuongTien instanceof OTo) {
                return oToRepository.deleteOToById(bienSo);
            }
        } else if (choice == NO) {
            System.out.println("Hủy thao tác xóa quay lại menu chính");
            return false;
        }
        return false;
    }

    public PhuongTien checkExistVehicle(String bienSo) {
        for (OTo oTo : findAllOTo()) {
            if (oTo.getBienKiemSoat().equals(bienSo)) {
                return oTo;
            }
        }

        for (XeTai xeTai : findAllXeTai()) {
            if (xeTai.getBienKiemSoat().equals(bienSo)) {
                return xeTai;
            }
        }

        for (XeMay xeMay : findAllXeMay()) {
            if (xeMay.getBienKiemSoat().equals(bienSo)) {
                return xeMay;
            }
        }
        return null;
    }
}
