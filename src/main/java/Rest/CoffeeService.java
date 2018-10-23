package Rest;

import Controller.CoffeeController;
import Entities.Product;
import jdk.nashorn.internal.objects.annotations.Getter;

import javax.websocket.server.ServerEndpoint;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;

@Path("/Coffee")
public class CoffeeService {
    private CoffeeController coffeeController  = new CoffeeController();

//    @GET
//    @Path("/Coffees")
//    public List<Product> getCoffees(){
//        return coffeeController.getAllProducts();
//    }

    @POST
    @Path("order")
    public int order(@FormParam("productId") int porductId,@FormParam("milk") int milk, @FormParam("sugar") int sugar){
        System.out.println("iets hier");
        return 1;
    }

    @GET
    @Path("test")
    public String test(){
        System.out.println("stuff happend");
        return "asf";
    }
}
