import java.util.ArrayList;
import java.util.Comparator;

public class ProductManager {
    public static final ArrayList<Product> products = new ArrayList<>();
    private static int id = 0;

    public static void addProduct(String name, String dateOfManufacture, String expiryDate, int price){
        products.add(new Product(id++,name,dateOfManufacture,expiryDate,price));
    }

    public static Product getProductById(int id){
        for (Product product : products){
            if(product.getId() == id){
                return product;
            }
        }
        return null;
    }

    public static void removeProduct(int id){
        Product product = getProductById(id);
        products.remove(product);
    }

    public static void showProduct(){
        System.out.println("Product :");
        for(Product product :products){
            System.out.println(product);
        }
    }

    public static void showProductByName(String name){
        for (Product product : products){
            if(product.getProductName().equals(name)){
                System.out.println(product);
            }
        }
    }


}
