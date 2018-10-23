package DAL;

import Entities.Order;
import Entities.Product;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;


public class JPACoffee implements IsCoffee {
    private EntityManager em;
    public JPACoffee(EntityManager em){this.em = em;}
    public Order something(){
        Order result;
        result = em.find(Order.class ,21);
        return result;
    }

    public void placeOrder(int orderId, int milk, int sugar, int userId){
        //@TODO Implement.
    }

}
