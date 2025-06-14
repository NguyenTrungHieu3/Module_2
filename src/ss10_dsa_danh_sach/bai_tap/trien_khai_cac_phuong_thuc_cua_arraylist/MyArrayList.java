package ss10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_arraylist;

import java.util.Arrays;

public class MyArrayList<E> {
    private  int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object[] elements;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity must be a positive integer");
        }
        elements = new Object[capacity];
    }

    public int size() {
        return size;
    }

    public void clear() {
        for (int i = 0; i < this.size; i++) {
            elements[i] = null;
        }
        this.size = 0;
    }

    public boolean add(E e) {
        if (size == elements.length) {
            this.ensureCapacity(5);
        }
        elements[size++] = e;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity <= 0) {
            throw new IllegalArgumentException("minCapacity must be a positive integer");
        }
        int newSize = elements.length + minCapacity;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        if (size == elements.length) {
            this.ensureCapacity(5);
        }

        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = e;
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        E e = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return e;
    }

    public boolean contains(E e) {
        return this.indexOf(e) >= 0;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    public E get(int i) {
        return (E) elements[i];
    }

    public MyArrayList<E> clone() {
        MyArrayList<E> v = new MyArrayList<>();
        v.elements = Arrays.copyOf(elements, size);
        v.size = size;
        return v;
    }
}
