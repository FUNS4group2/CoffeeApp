package Controller;

import DAL.IsCoffee;
import DAL.JPACoffee;
import Entities.Order;
import Entities.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class CoffeeController {
    private EntityManager em;
    private IsCoffee jpaCoffee;
    public CoffeeController(){
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("CoffeePU");
            em = emf.createEntityManager();
//            emf.close();
            jpaCoffee = new JPACoffee(em);
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
    }


    public Order doSomething() {
    return jpaCoffee.something();
    }

    public void PlaceOrder(String orderId, int milk, int sugar, int userId) {
        jpaCoffee.placeOrder(orderId, milk, sugar, userId);
    }
}
