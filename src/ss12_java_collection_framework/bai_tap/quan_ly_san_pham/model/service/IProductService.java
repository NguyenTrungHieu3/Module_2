package ss12_java_collection_framework.bai_tap.quan_ly_san_pham.model.service;

import ss12_java_collection_framework.bai_tap.quan_ly_san_pham.model.entity.Product;

import java.util.List;

public interface IProductService {
    boolean addProduct(Product product);
    boolean checkProductById(int id);
    boolean isExistProduct(Product product);
    boolean updateProduct(Product product);
    boolean deleteProduct(int productId);
    List<Product> getAllProducts();
    Product findProductByName(String name);
    boolean sortProduct();
}
