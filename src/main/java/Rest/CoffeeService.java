package Rest;

import Controller.CoffeeController;
import Entities.Product;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.ws.rs.FormParam;
import javax.websocket.server.ServerEndpoint;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;
@ServerEndpoint(value = "/coffee")
@Path("/Coffee")
public class CoffeeService {
    private CoffeeController coffeeController  = new CoffeeController();

    @GET
    @Path("/Coffees")
    public List<Integer> getCoffees(){
    throw new NotImplementedException();
    }

    @POST
    @Path("/order")
    public void placeOrder(@FormParam("OderId") int OrderId,@FormParam("milk") int milk, @FormParam("Sugar") int sugar){
        //@TODO @Stijn Implement in ORM/JPA
        System.out.println("I recieved something");
        int userID =1;
        coffeeController.PlaceOrder(OrderId, milk, sugar, userID);
    }
}
