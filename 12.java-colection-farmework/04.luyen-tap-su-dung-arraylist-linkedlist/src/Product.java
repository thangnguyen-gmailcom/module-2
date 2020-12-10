public class Product {
    private int id;
    private String productName;
    private String dateOfManufacture;
    private String expiryDate;
    private int price;

    public Product(int id, String productName, String dateOfManufacture, String expiryDate, int price) {
        this.id = id;
        this.productName = productName;
        this.dateOfManufacture = dateOfManufacture;
        this.expiryDate = expiryDate;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public int getPrice() {
        return price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", dateOfManufacture='" + dateOfManufacture + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", price=" + price +
                '}';
    }
}
