package RestaurantsManagementSystem;

public class OrderItem {

    private Product product ; // order item has a product - composition
    private int quantity;

    public OrderItem ( Product product , int quantity) {

        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return this.product;
    }

    public double getSubTotal () {

        return this.product.getPrice() * this.quantity ;
    }

    public void addQuantity (int value) {

        this.quantity += value ;
    }

    public int getQuantity () {

        return this.quantity;
    }
}
