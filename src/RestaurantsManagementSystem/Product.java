package RestaurantsManagementSystem;

public class Product {

    private String prodID;
    private String name;
    private Double price;
    private String category;
    private String description;
    private boolean isAvailable;

    public Product ( String name , Double price , String category , String description ) {

        this.prodID = "PID" + name;
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        this.isAvailable = true;
    }

    public String getProdID () {
        return prodID;
    }

    public String getName () {
        return name;
    }

    public String getCategory () {
        return category;
    }

    public String getDescription () {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
