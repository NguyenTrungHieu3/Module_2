package ss12_java_collection_framework.thuc_hanh.sap_xep_voi_comparable_va_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kien", 30, "HT");
        Student student1 = new Student("Nam", 26, "HN");
        Student student2 = new Student("Anh", 38, "HT" );
        Student student3 = new Student("Tung", 38, "HT" );

        List<Student> lists = new ArrayList<>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        System.out.println("So sánh theo tên: ");
        for (Student s : lists) {
            System.out.println(s);
        }

        AgeComparator ageComparator = new AgeComparator();
        lists.sort(ageComparator);
        System.out.println("So sánh theo tuổi: ");
        for (Student s : lists) {
            System.out.println(s);
        }
    }
}
