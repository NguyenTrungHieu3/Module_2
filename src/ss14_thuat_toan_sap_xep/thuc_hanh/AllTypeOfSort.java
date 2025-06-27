package ss14_thuat_toan_sap_xep.thuc_hanh;

public class AllTypeOfSort {
    public static int[] bubbleort(int[] arr) {
        boolean flag = false;
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = arr.length-1; j >= i ; j--) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                return arr;
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        int pos;
        int x;
        for (int i = 1; i < arr.length; i++) {
            pos = i;
            x = arr[i];
            while (pos > 0 && x < arr[pos-1]) {
                arr[pos] = arr[pos-1];
                pos--;
            }
            arr[pos] = x;
        }
        return arr;
    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] list = {4,5,5,6,2,3,12,34};
        int[] arr = bubbleort(list);
        displayArray(arr);
    }
}
