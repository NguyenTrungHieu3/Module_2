package ss12_java_collection_framework.bai_tap.quan_ly_san_pham.controller;

import ss12_java_collection_framework.bai_tap.quan_ly_san_pham.model.entity.Product;
import ss12_java_collection_framework.bai_tap.quan_ly_san_pham.view.ProductView;

import java.util.Scanner;

public class MainController {
    private static final ProductController productController = new ProductController();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("-------------------- QUẢN LÝ SẢN PHẨM --------------------");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm");
            System.out.println("6. Sắp xếp sản phẩm theo giá");
            System.out.println("7. Thoát");
            System.out.print("Mời bạn nhập lựa chọn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    Product product = ProductView.inputProduct();
                    if (productController.addProduct(product)) {
                        System.out.println("Thêm sản phẩm thành công");
                    } else {
                        System.out.println("Lỗi thêm sản phẩm");
                    }
                    break;
                case 2:
                    if (productController.updateProduct()) {
                        System.out.println("Sửa sản phẩm thành công");
                    } else {
                        System.out.println("Lỗi sửa sản phẩm");
                    }
                    break;
                case 3:
                    if (productController.deleteProduct()) {
                        System.out.println("Xóa sản phẩm thành công");
                    } else {
                        System.out.println("Lỗi xóa sản phẩm");
                    }
                    break;
                case 4:
                    productController.displayListProduct();
                    break;
                case 5:
                    Product findProduct = productController.findProductByName();
                    if (findProduct != null) {
                        System.out.println("Sản phẩm cần tìm là: ");
                        System.out.println(findProduct);
                    } else {
                        System.out.println("Không tìm thấy sản phẩm");
                    }
                    break;
                case 6:
                    if (productController.sortProducts()) {
                        System.out.println("Sắp xếp sản phẩm thành công");
                    } else {
                        System.out.println("Lỗi sắp xếp");
                    }
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Không có lựa chọn này trong menu. Vui lòng chọn lại");
                    break;
            }
        }
    }
}
