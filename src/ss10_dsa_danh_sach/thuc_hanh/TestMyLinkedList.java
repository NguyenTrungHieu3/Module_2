package ss10_dsa_danh_sach.thuc_hanh;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(4);
        myLinkedList.addFirst(5);
        myLinkedList.add(2, 99999);
        myLinkedList.add(3, 99999);
        myLinkedList.printList();
    }
}
