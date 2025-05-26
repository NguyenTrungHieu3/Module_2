package ss5_access_modifier.bai_tap.product_manager;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    ArrayList<Product> products;
    Scanner sc = new Scanner(System.in);
    public ProductManager() {
        products = new ArrayList<Product>();
    }

    public void addProduct() {
        System.out.println("Nhập id: ");
        int addId = Integer.parseInt(sc.nextLine());
        for (Product product : products) {
            if (product.getId() == addId) {
                System.out.println("Id đã tồn tại");
                return;
            }
        }
        System.out.println("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        double price = Double.parseDouble(sc.nextLine());
        Product newProduct = new Product(addId, name, price);
        products.add(newProduct);
        System.out.println("Thêm sản phẩm thành công");
    }

    public void deleteProduct() {
        System.out.println("Nhập id sản phẩm muốn xóa: ");
        int deleteId = Integer.parseInt(sc.nextLine());
        for (Product product : products) {
            if (product.getId() == deleteId) {
                products.remove(product);
                System.out.println("Xóa sản phẩm thành công");
                return;
            }
        }
        System.out.println("Không tìm thấy id muốn xóa");
    }

    public void updateProduct() {
        System.out.println("Nhập id sản phẩm muốn cập nhật");
        int updateId = Integer.parseInt(sc.nextLine());
        for (Product product : products) {
            if (product.getId() == updateId) {
                System.out.println("Nhập tên sản phẩm: ");
                String name = sc.nextLine();
                System.out.println("Nhập giá sản phẩm: ");
                double price = Double.parseDouble(sc.nextLine());
                product.setName(name);
                product.setPrice(price);
                System.out.println("Sửa sản phẩm thành công");
                return;
            }
        }
        System.out.println("Không tìm thấy id muốn sửa");
    }

    public void displayProducts() {
        System.out.println("Danh sách sản phẩm: ");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void searchProduct() {
        System.out.println("Nhập id sản phẩm muốn tìm");
        int searchId = Integer.parseInt(sc.nextLine());
        for (Product product : products) {
            if (product.getId() == searchId) {
                System.out.println("Sản phẩm muốn tìm là: ");
                System.out.println(product);
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm có id "+searchId);
    }
}
