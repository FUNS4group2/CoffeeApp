package Entities;
import javax.persistence.*;


@NamedQueries({@NamedQuery(name = "Product.getAll", query = "select p from Products p")
})
@Entity @Table(name="Products")
public class Product {

    @Id
    private int id;
    private String name;
    private int volume;

    public Product(){};


}
