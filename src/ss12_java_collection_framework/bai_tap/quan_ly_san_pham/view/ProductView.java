package ss12_java_collection_framework.bai_tap.quan_ly_san_pham.view;

import ss12_java_collection_framework.bai_tap.quan_ly_san_pham.model.entity.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    public static Product inputProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá tiền: ");
        double price = Double.parseDouble(scanner.nextLine());
        return new Product(id, name, price);
    }

    public static void displayListProducts(List<Product> listProducts) {
        System.out.println("Danh sách sản phẩm là: ");
        int dem = 0;
        for (Product product : listProducts) {
            System.out.println("Sản phẩm thứ " + (dem++));
            System.out.println(product);
        }
    }
}
