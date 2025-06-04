package ss8_clean_code.bai_tap.quan_ly_sinh_vien.controller;

import ss8_clean_code.bai_tap.quan_ly_sinh_vien.entity.Student;
import ss8_clean_code.bai_tap.quan_ly_sinh_vien.service.IStudentService;
import ss8_clean_code.bai_tap.quan_ly_sinh_vien.service.StudentService;

public class StudentController {
    private IStudentService studentService = new StudentService();
    public void add(Student student) {
        studentService.add(student);
    }

    public Student[] findAll() {
        return studentService.findAll();
    }
}
