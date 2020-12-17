import java.io.Serializable;

public class Products implements Serializable {
    private static long serialversionUID = 1L;
    private int id;
    private String productName;
    private String productMaker;
    private int price;
    private String description;


    public Products(){}

    public Products(int id, String productName, String productMaker, int price, String description) {
        this.id = id;
        this.productName = productName;
        this.productMaker = productMaker;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductMaker() {
        return productMaker;
    }

    public void setProductMaker(String productMaker) {
        this.productMaker = productMaker;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productMaker='" + productMaker + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

}
