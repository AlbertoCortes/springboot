package academy.digitallab.store.service_product.repository;

import academy.digitallab.store.service_product.entity.Category;
import academy.digitallab.store.service_product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    public List<Product> findByCategory(Category category);


}
