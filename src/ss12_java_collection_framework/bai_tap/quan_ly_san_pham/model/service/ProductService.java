package ss12_java_collection_framework.bai_tap.quan_ly_san_pham.model.service;

import ss12_java_collection_framework.bai_tap.quan_ly_san_pham.model.entity.PriceComparator;
import ss12_java_collection_framework.bai_tap.quan_ly_san_pham.model.entity.Product;
import ss12_java_collection_framework.bai_tap.quan_ly_san_pham.model.repository.IProductRepository;
import ss12_java_collection_framework.bai_tap.quan_ly_san_pham.model.repository.ProductRepository;

import java.util.Comparator;
import java.util.List;

public class ProductService implements IProductService {
    private final IProductRepository productRepository;

    public ProductService() {
        productRepository = new ProductRepository();
    }

    @Override
    public boolean addProduct(Product product) {
        if (isExistProduct(product)) {
            System.out.println("Đã có sản phẩm có id " + product.getId() + " trong kho");
            return false;
        }
        productRepository.addProduct(product);
        return true;
    }

    @Override
    public boolean checkProductById(int id) {
        List<Product> listProducts = productRepository.getAllProduct();
        for (Product p : listProducts) {
            if (p.getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isExistProduct(Product product) {
        List<Product> listProducts = productRepository.getAllProduct();
        for (Product p : listProducts) {
            if (p.equals(product)) {
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean updateProduct(Product product) {
        if (isExistProduct(product)) {
            productRepository.updateProduct(product);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteProduct(int productId) {
        if (checkProductById(productId)) {
            productRepository.deleteProduct(productId);
            return true;
        }
        System.out.println("Không có sản phẩm có id = " + productId + " trong kho");
        return false;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getAllProduct();
    }

    @Override
    public Product findProductByName(String name) {
        List<Product> listProducts = productRepository.getAllProduct();
        for (Product p : listProducts) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public boolean sortProduct() {
        PriceComparator priceComparator = new PriceComparator();
        List<Product> listProducts = productRepository.getAllProduct();
        listProducts.sort(priceComparator);
        productRepository.setListProduct(listProducts);
        return true;
    }
}
