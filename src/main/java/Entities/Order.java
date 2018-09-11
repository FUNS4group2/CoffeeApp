package Entities;

import javax.persistence.*;

@Entity  @Table(name = "ORDERS")
public class Order {
    @Id
    private int id;
    private int product_id;
    private boolean sugar;
    private boolean milk;
    private int amount;
    private Product product;
    Order(){};
}
