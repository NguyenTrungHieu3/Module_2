package ss10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_arraylist;

import java.util.ArrayList;

public class TestMyArrayList {
    static class Student {
        String name;
        int age;
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
    public static void main(String[] args) {
        Student student1 = new Student("Hieu", 19);
        Student student2 = new Student("Binh", 20);
        Student student3 = new Student("Minh", 21);
        Student student4 = new Student("Long", 22);
        Student student5 = new Student("Tuan", 23);
        MyArrayList<Student> myArrayList = new MyArrayList<>();
        myArrayList.add(student1);
        myArrayList.add(student2);
        myArrayList.add(student3);
        myArrayList.add(student4);
        myArrayList.add(student5);
        System.out.println("-----------------------------");
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }
        Student student6 = new Student("Hieu", 100);
        myArrayList.add(student6,2);
        System.out.println("-----------------------------");
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }
        myArrayList.remove(0);
        System.out.println("-----------------------------");
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }

        System.out.println("size = " + myArrayList.size());

        MyArrayList<Student> myArrayList2 = myArrayList.clone();
        System.out.println("-----------------------------");
        for (int i = 0; i < myArrayList2.size(); i++) {
            System.out.println(myArrayList2.get(i));
        }

        System.out.println(myArrayList.contains(student2));

        System.out.println(myArrayList.indexOf(student2));

        myArrayList.clear();

        System.out.println("-----------------------------");
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }
    }
}
