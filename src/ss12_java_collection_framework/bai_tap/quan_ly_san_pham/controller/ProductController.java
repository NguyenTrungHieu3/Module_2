package ss12_java_collection_framework.bai_tap.quan_ly_san_pham.controller;

import ss12_java_collection_framework.bai_tap.quan_ly_san_pham.model.entity.Product;
import ss12_java_collection_framework.bai_tap.quan_ly_san_pham.model.service.IProductService;
import ss12_java_collection_framework.bai_tap.quan_ly_san_pham.model.service.ProductService;
import ss12_java_collection_framework.bai_tap.quan_ly_san_pham.view.ProductView;

import java.util.List;
import java.util.Scanner;

public class ProductController {
    private static IProductService productService;

    public ProductController() {
        productService = new ProductService();
    }

    public boolean addProduct(Product product) {
        return productService.addProduct(product);
    }

    public boolean updateProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm muốn cập nhật: ");
        int id = Integer.parseInt(scanner.nextLine());
        if (productService.checkProductById(id)) {
            Product product = ProductView.inputProduct();
            return productService.updateProduct(product);
        }
        System.out.println("Không có sản phẩm có id = " + id + " trong kho");
        return false;
    }

    public boolean deleteProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        return productService.deleteProduct(id);
    }

    public void displayListProduct() {
        List<Product> listProducts = productService.getAllProducts();
        ProductView.displayListProducts(listProducts);
    }

    public Product findProductByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm muốn tìm: ");
        String productName = scanner.nextLine();
        return productService.findProductByName(productName);
    }

    public boolean sortProducts() {
        return productService.sortProduct();
    }
}
