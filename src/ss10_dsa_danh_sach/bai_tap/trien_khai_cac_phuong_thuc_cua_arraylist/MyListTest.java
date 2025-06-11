package ss10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_arraylist;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();

        // Thêm phần tử
        myList.add("Java");
        myList.add("C++");
        myList.add("Python");
        myList.add("JavaScript");
        myList.add(1, "Go");

        // In danh sách
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Element " + i + ": " + myList.get(i));
        }

        // Xoá phần tử
        System.out.println("Removed: " + myList.remove(2));

        // Kiểm tra chứa
        System.out.println("Contains 'Python'? " + myList.contains("Python"));
        System.out.println("Index of 'Go': " + myList.indexOf("Go"));

        // Clone danh sách

        // Clear danh sách
        myList.clear();
        System.out.println("Size after clear: " + myList.size());
    }
}
