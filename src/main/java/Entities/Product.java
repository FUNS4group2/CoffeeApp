package Entities;
import javax.persistence.*;



@Entity @Table(name="Products")
public class Product {

    @Id
    private int id;
    @Column
    private String name;
    @Column
    private int volume;

    public Product(){};


}
