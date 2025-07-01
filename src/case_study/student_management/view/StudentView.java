package case_study.student_management.view;

import case_study.student_management.model.entity.OfficialStudent;
import case_study.student_management.model.entity.Student;
import case_study.student_management.model.entity.TrialStudent;
import case_study.validate.ValidationUtils;
import ss17_binary_file_serialization.bai_tap.vehicle_management.model.entity.Truck;
import ss17_binary_file_serialization.bai_tap.vehicle_management.regex.CheckCarRegex;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    public int displayAddStudentMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("Chọn loại học viên muốn thêm mới: ");
        System.out.println("1. Thêm học viên chính thức");
        System.out.println("2. Thêm học viên học thử");
        System.out.println("3. Quay lại menu chính");
        System.out.print("Mời bạn nhập lựa chọn: ");
        return Integer.parseInt(sc.nextLine());
    }

    public int displayMenuDisplayStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("Chọn loại học viên muốn hiển thị: ");
        System.out.println("1. Hiển thị học viên chính thức");
        System.out.println("2. Hiển thị học thử");
        System.out.println("3. Hiển thị tất cả học viên");
        System.out.println("4. Quay lại menu chính");
        System.out.print("Mời bạn nhập lựa chọn: ");
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Vui lòng nhập số!");
            return -1;
        }
    }

    public OfficialStudent inputOfficialStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("====== Nhập thông học viên chính thức ======");
        String studentId;
        do {
            System.out.println("Nhập mã học viên chính thức theo định dạng (OSxxx) với x là số nguyên: ");
            studentId = sc.nextLine();
        } while (!ValidationUtils.isValidOfficalStudentId(studentId));
        System.out.println("Nhập tên học viên: ");
        String name = sc.nextLine();
        String email;
        do {
            System.out.println("Nhập email: ");
            email = sc.nextLine();
        } while (!ValidationUtils.isValidEmail(email));
        String phone;
        do {
            System.out.println("Nhập số điện thoại: ");
            phone = sc.nextLine();
        } while (!ValidationUtils.isValidPhone(phone));
        String birthday;
        do {
            System.out.println("Nhập ngày sinh theo định dạng (dd/mm/yyyy): ");
            birthday = sc.nextLine();
        } while (!ValidationUtils.isValidBirthDay(birthday));
        System.out.println("Nhập tên khóa học: ");
        String courseName = sc.nextLine();
        System.out.println("Nhập học phí: ");
        double feePaid = Double.parseDouble(sc.nextLine());
        return new OfficialStudent(studentId, name, email, phone, birthday, courseName, feePaid);
    }

    public TrialStudent inputTrialStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("====== Nhập thông học viên học thử ======");
        String studentId;
        do {
            System.out.println("Nhập mã học viên học thử theo định dạng (TSxxx) với x là số nguyên: ");
            studentId = sc.nextLine();
        } while (!ValidationUtils.isValidOfficalStudentId(studentId));
        System.out.println("Nhập tên học viên: ");
        String name = sc.nextLine();
        String email;
        do {
            System.out.println("Nhập email: ");
            email = sc.nextLine();
        } while (!ValidationUtils.isValidEmail(email));
        String phone;
        do {
            System.out.println("Nhập số điện thoại: ");
            phone = sc.nextLine();
        } while (!ValidationUtils.isValidPhone(phone));
        String birthday;
        do {
            System.out.println("Nhập ngày sinh theo định dạng (dd/mm/yyyy): ");
            birthday = sc.nextLine();
        } while (!ValidationUtils.isValidBirthDay(birthday));
        int trialDays;
        do {
            System.out.println("Nhập số ngày học thử: ");
            trialDays = Integer.parseInt(sc.nextLine());
        } while (!ValidationUtils.isValidTrialDays(trialDays));
        return new TrialStudent(studentId, name, email, phone, birthday, trialDays);
    }

    public void displayAllOfficialStudent(List<OfficialStudent> officialStudentList) {
        System.out.println("========================================");
        System.out.println("Danh sách học viên chính thức: ");
        for (OfficialStudent officialStudent : officialStudentList) {
            System.out.println(officialStudent);
        }
    }

    public void displayAllTrialStudent(List<TrialStudent> trialStudentList) {
        System.out.println("========================================");
        System.out.println("Danh sách học viên học thử: ");
        for (TrialStudent trialStudent : trialStudentList) {
            System.out.println(trialStudent);
        }
    }

    public void displayAllStudent(List<Student> studentList) {
        System.out.println("========================================");
        System.out.println("Danh sách tất cả học viên là: ");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
