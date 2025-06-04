package ss8_clean_code.bai_tap.quan_ly_sinh_vien.service;

import ss8_clean_code.bai_tap.quan_ly_sinh_vien.entity.Student;

public interface IStudentService {
    void add(Student student);

    Student[] findAll();
}
