package DAL;

import Entities.Product;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;


public class JPACoffee implements IsCoffee {
    private EntityManager em;
    public JPACoffee(EntityManager em){this.em = em;}

}
