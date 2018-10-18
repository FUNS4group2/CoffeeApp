package Rest;

import Controller.CoffeeController;
import Entities.Product;

import javax.websocket.server.ServerEndpoint;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;
@ServerEndpoint(value = "/coffee")
@Path("/Coffee")
public class CoffeeService {
    private CoffeeController coffeeController  = new CoffeeController();

    @GET
    @Path("/Coffees")
    public List<Product> getCoffees(){
        return coffeeController.getAllProducts();
    }
}
