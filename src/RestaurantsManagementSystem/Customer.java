package RestaurantsManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String customerID;
    private String name;
    private String phone;
    private List<Order> orderHistory;
    private Order currentOrder;

    public Customer ( String name , String phone) {

        this.customerID = "Cust ID - " + name + Math.random();
        this.name = name;
        this.phone = phone;
        this.orderHistory = new ArrayList<>();
        this.currentOrder = new Order();
    }
}