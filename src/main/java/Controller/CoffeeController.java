package Controller;

import DAL.IsCoffee;
import DAL.JPACoffee;
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
            jpaCoffee = new JPACoffee(em);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public List<Product> getAllProducts() {
        return jpaCoffee.getAllProducts();
    }
}