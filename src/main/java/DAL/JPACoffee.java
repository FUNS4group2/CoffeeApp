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
        Order result = null;
        result = em.find(result.getClass(),21);
        return result;
    }

}
