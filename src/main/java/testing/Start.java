package testing;

import Controller.CoffeeController;
import Entities.Product;

public class Start {

    public static void main(String[] args){
        CoffeeController cc = new CoffeeController();
        System.out.println(cc.doSomething().toString());
        System.out.println("Done");
    }
}
