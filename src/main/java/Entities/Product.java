package Entities;
import javax.persistence.*;

@Entity @Table(name="PRODUCTS")
public class Product {
    @Id
    private int id;
    private String name;
    private int volume;

    Product(){};


}
