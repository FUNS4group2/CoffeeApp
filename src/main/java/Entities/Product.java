package Entities;
import javax.persistence.*;



@Entity @Table(name="Products")
public class Product {

    @Id
    private int id;
    private String name;
    private int volume;

    public Product(){};


}
