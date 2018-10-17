package testing;

import Controller.CoffeeController;
import Entities.Product;

public class Start {

    public static void main(String[] args){
        CoffeeController cc = new CoffeeController();
        for(Product p : cc.getAllProducts()){
            System.out.println(p.toString());
        }
        System.out.println("Done");
    }
}
