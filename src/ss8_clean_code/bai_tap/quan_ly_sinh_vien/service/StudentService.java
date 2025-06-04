package ss8_clean_code.bai_tap.quan_ly_sinh_vien.service;

import ss8_clean_code.bai_tap.quan_ly_sinh_vien.entity.Student;
import ss8_clean_code.bai_tap.quan_ly_sinh_vien.repository.StudentRepository;

public class StudentService implements IStudentService{
    private StudentRepository studentRepository = new StudentRepository();
    @Override
    public void add(Student student) {
        studentRepository.add(student);
    }

    @Override
    public Student[] findAll() {
        return studentRepository.findAll();
    }
}
