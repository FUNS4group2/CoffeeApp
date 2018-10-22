package DAL;

import Entities.Order;
import Entities.Product;

import java.util.ArrayList;
import java.util.List;

public interface IsCoffee {
    Order something();

    void placeOrder(int orderId, int milk, int sugar, int userId);
}
