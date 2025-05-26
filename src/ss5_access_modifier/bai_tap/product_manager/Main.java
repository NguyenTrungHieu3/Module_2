package ss5_access_modifier.bai_tap.product_manager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        final int ADD = 1;
        final int UPDATE = 2;
        final int DELETE = 3;
        final int SEARCH = 4;
        final int DISPLAY = 5;
        final int EXIT = 6;
        Scanner sc = new Scanner(System.in);
        ProductManager pm = new ProductManager();
        boolean flag = true;
        while(flag) {
            System.out.println("-------------------- MENU --------------------\n"
                    + "1. Add product\n"
                    + "2. Update product\n"
                    + "3. Delete product\n"
                    + "4. Search product\n"
                    + "5. Display all products\n"
                    + "6. Exit\n");
            System.out.println("Please enter your choice");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case ADD:
                    pm.addProduct();
                    break;
                case UPDATE:
                    pm.updateProduct();
                    break;
                case DELETE:
                    pm.deleteProduct();
                    break;
                case SEARCH:
                    pm.searchProduct();
                    break;
                case DISPLAY:
                    pm.displayProducts();
                    break;
                case EXIT:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
