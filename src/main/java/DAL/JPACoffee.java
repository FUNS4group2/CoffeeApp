package DAL;

import Entities.Product;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


public class JPACoffee implements IsCoffee {
    private EntityManager em;
    public JPACoffee(EntityManager em){this.em = em;}

    public List<Product> getAllProducts() {
        Query qry = em.createNamedQuery("Product.getAll");
        return qry.getResultList();
    }
}
