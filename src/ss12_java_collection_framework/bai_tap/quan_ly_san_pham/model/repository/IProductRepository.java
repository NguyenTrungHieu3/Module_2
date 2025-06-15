package ss12_java_collection_framework.bai_tap.quan_ly_san_pham.model.repository;

import ss12_java_collection_framework.bai_tap.quan_ly_san_pham.model.entity.Product;

import java.util.List;

public interface IProductRepository {
    void addProduct(Product product);
    List<Product> getAllProduct();
    void updateProduct(Product product);
    void deleteProduct(int productId);
    void setListProduct(List<Product> listProduct);
}
