package academy.digitallab.store.service_product.service;

import academy.digitallab.store.service_product.entity.Category;
import academy.digitallab.store.service_product.entity.Product;
import academy.digitallab.store.service_product.repository.ProductRepository;

import java.util.List;

public interface ProductService {
    public List<Product> listAllProduct();
    public Product getProduct(Long id);
    public Product createProduct(Product product);
    public Product updateProduct(Product product);
    public Product deleteProduct(Long id);
    public List<Product> findByCategory(Category category);
    public Product updateStock(Long id, Double quantity);
}
