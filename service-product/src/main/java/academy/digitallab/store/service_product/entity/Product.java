package academy.digitallab.store.service_product.entity;

import jakarta.persistence.*;

import java.nio.DoubleBuffer;
import java.util.Date;

@Entity
@Table(name = "tbl_products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name, description, status;
    private Double stock, price;
    private Date createAt;
    private Category category;

}
