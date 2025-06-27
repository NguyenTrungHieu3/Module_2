package ss10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_linkedlist;

public class MyLinkedList<E> {
    class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    private Node head;
    private int numNodes;

    public MyLinkedList() {
        head = null;
        numNodes = 0;
    }

    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IllegalArgumentException("Vị trí thêm không hợp lệ");
        }

        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
        } else if (index == 0) {
            addFirst(element);
        } else {
            Node temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            numNodes++;
        }
    }

    public void addFirst(E element) {
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }

    public void addLast(E element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        numNodes++;
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IllegalArgumentException("Vị trí xóa không hợp lệ "+index);
        }
        if (head == null) {
            throw new IndexOutOfBoundsException();
        }
        E result;
        if (index == 0) {
            result = (E) head.data;
        }else {
            Node temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            result = (E) temp.next.data;
            temp.next = temp.next.next;
        }
        numNodes--;
        return result;
    }

    public boolean remove(Object o) {
        if (head == null) {
            return false;
        }

        if (head.data!=null && head.data.equals(o)) {
            head = head.next;
            numNodes--;
            return true;
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data!=null && temp.next.data.equals(o)) {
                temp.next = temp.next.next;
                numNodes--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    public MyLinkedList<E> clone() {
        MyLinkedList<E> cloneList = new MyLinkedList<>();
        Node temp = head;
        while (temp != null) {
            cloneList.addLast((E)temp.data);
            temp = temp.next;
        }
        return cloneList;
    }

    public boolean contains(Object o) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(o)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object o) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if ((temp.data == null && o == null) || (temp.data != null && temp.data.equals(o))) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public void ensureCapacity(int minCapacity) {

    }

    public E get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IllegalArgumentException("Vị trí không hợp lệ");
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return (E) temp.data;
        }
    }

    public E getFirst() {
        if (head == null) {
            return null;
        } else {
            return (E)head.data;
        }
    }

    public E getLast() {
        if (head == null) {
            return null;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            return (E)temp.data;
        }
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }


}
