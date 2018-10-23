package Rest;
import Controller.CoffeeController;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/Coffee")
public class CoffeeService {
    private CoffeeController coffeeController  = new CoffeeController();

//    @GET
//    @Path("/Coffees")
//    public List<Product> getCoffees(){
//        return coffeeController.getAllProducts();
//    }

    @GET
    @Path("test")
    public String test() {
        System.out.println("stuff happend");
        return "asf";
    }

    @POST
    @Path("order")
    public Response placeOrder(@FormParam("product") String product, @FormParam("milkAmount") int milk, @FormParam("sugarAmount") int sugar){
        //@TODO @Stijn Implement in ORM/JPA
        System.out.println("I recieved something");
        System.out.println(product +" " + milk +  " " + sugar);
        int userID =1;
        coffeeController.PlaceOrder(product, milk, sugar, userID);
        return Response.ok()
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods", "POST, GET, PUT, UPDATE, OPTIONS")
                .header("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With").build();
    }
}
