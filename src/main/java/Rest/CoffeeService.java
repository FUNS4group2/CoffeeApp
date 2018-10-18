package Rest;

import Controller.CoffeeController;
import Entities.Product;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("/Coffee")
public class CoffeeService {
    private CoffeeController coffeeController  = new CoffeeController();

    @GET
    @Path("/Coffees")
    public List<Integer> getCoffees(){
    throw new NotImplementedException();
    }
}
