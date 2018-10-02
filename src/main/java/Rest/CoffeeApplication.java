package Rest;

import Controller.CoffeeController;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("/Rest")
public class CoffeeApplication {
    @PostConstruct
    public void init(){
        new CoffeeController();
    }

}
