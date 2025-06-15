package ss12_java_collection_framework.bai_tap.quan_ly_san_pham.model.repository;

import ss12_java_collection_framework.bai_tap.quan_ly_san_pham.model.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    List<Product> productList = new ArrayList<Product>();

    public ProductRepository() {
        productList.add(new Product(1, "Kem đánh răng", 50000));
        productList.add(new Product(2, "Bàn chải đánh răng", 100000));
        productList.add(new Product(3, "Listerine", 80000));
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    public List<Product> getAllProduct() {
        return productList;
    }

    @Override
    public void updateProduct(Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == product.getId()) {
                productList.set(i, product);
            }
        }
    }

    @Override
    public void deleteProduct(int productId) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == productId) {
                productList.remove(i);
            }
        }
    }

    @Override
    public void setListProduct(List<Product> listProduct) {
        productList = listProduct;
    }
}
