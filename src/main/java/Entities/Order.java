package Entities;

import javax.persistence.*;

@Entity  @Table(name = "ORDERS")
@NamedQueries(
        @NamedQuery(name = "Order.GetAll", query = "Select Product.Type_Name, Milk As MilkAmount, Sugar As SugarAmount, Amount As Size " +
                                                    "FROM orders Inner join Product on Product_Id = Product.Id")
)
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
