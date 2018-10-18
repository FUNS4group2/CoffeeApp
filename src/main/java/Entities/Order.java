package Entities;

import javax.persistence.*;

@Entity  @Table(name = "ORDERS")
public class Order {
    @GeneratedValue
    @Id
    private int id;

    @Column
    private boolean sugar;

    @Column
    private boolean milk;

    @Column
    private int amount;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
    public Order(){};
}
