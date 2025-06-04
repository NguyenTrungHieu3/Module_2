package ss8_clean_code.bai_tap.quan_ly_sinh_vien.repository;

import ss8_clean_code.bai_tap.quan_ly_sinh_vien.entity.Student;

public class StudentRepository {
    private Student[] students = new Student[10];
    private int size = 0;

    public void add(Student student) {
        students[size++] = student;
    }

    public Student[] findAll() {
        Student[] result = new Student[size];
        for (int i = 0; i < size; i++) {
            result[i] = students[i];
        }
        return result;
    }
}
