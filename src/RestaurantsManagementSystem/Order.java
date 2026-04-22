package RestaurantsManagementSystem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Order {

    private String orderId;
    private List<OrderItem> items;
    private String orderStatus;

    public Order () {
        this.orderId = "Order - " + LocalDateTime.now().toString();
        items = new ArrayList<>();
        this.orderStatus = "PENDING";
    }

    public void addOrderItem (OrderItem item , int quantity) {

        if (item.getProduct().isAvailable()) {

            for ( OrderItem orderItem : items) {
                if (orderItem.getProduct().getProdID().equals(item.getProduct().getProdID())) {
                    orderItem.addQuantity(quantity);
                    return;
                }
            }

            item.addQuantity(quantity);
            items.add(item);
        }
    }

    public void removeOrderItem (int index) {

        if (index >= 0 && index < this.items.size()) {

            this.items.remove(index);
        }
    }

    public String getOrderId() {
        return orderId;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public String getOrderStatus() {
        return orderStatus;
    }
}
