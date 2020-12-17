import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductsManager {

   private static ArrayList<Products> products;

    public static int id;

    static {
        File file = new File("product.dat");
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            Object fileObject =ois.readObject();
            if(fileObject == null){
                products = new ArrayList<>();
            }else {
                products = (ArrayList<Products>) fileObject;
            }
            int maxId = -1;
            for (Products product : products) {
                int id = product.getId();
                if (id > maxId) maxId = id;
            }
            id = maxId + 1;
        }  catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            products = new ArrayList<>();
        }finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void addProduct(String productName, String productMaker, int price, String description){
        products.add(new Products(id++, productName,productMaker,price,description));
        saveObjectToFile();
    }

    public void showProduct(){
        for (Products product : products) {
            System.out.println(product);
        }
    }

    public void showProductsByName(String name){
        for (Products product : products){
            if(product.getProductName() == name){
                System.out.println(product);
                return;
            }
        }
        System.out.println("Product not found!");
    }

    public Products getProductById(int id){
        for (Products product : products){
            if(product.getId() == id) {
                return product;
            }
        }
        return null;
    }


    public void removeProductById(int id){
        Products product = getProductById(id);
        products.remove(product);
    }

    public void editProduct(){
            Scanner scanner = new Scanner(System.in);
            int choice;
        while (true){
            System.out.println("1.add product");
            System.out.println("2.update product");
            System.out.println("3.show product");
            System.out.println("4.show product by id");
            System.out.println("5.remove product by id");
            System.out.println("6. exit !");

            do {
                System.out.println("Enter the number to select");
                choice = scanner.nextInt();
            }while ((choice < 1) || (choice > 6));

            switch (choice){
                case 1 :
                    String productName = inputString("enter the product name");
                    String productMaker = inputString("enter the product maker");
                    int price = inputInteger("enter the price");
                    String description = inputString("enter the description");
                    addProduct(productName,productMaker,price,description);
                    break;
                case 2:
                    int id = inputInteger("enter the id");
                    Products product = getProductById(id);
                    String productName1 = inputString("enter the product name");
                    String productMaker1 = inputString("enter the product maker");
                    int price1 = inputInteger("enter the price");
                    String description1 = inputString("enter the description");
                    product.setProductName(productName1);
                    product.setProductMaker(productMaker1);
                    product.setPrice(price1);
                    product.setDescription(description1);
                    break;
                case 3:
                    showProduct();
                    break;
                case 4:
                    String name = inputString("enter the name :");
                    showProductsByName(name);
                    break;
                case 5:
                    int id2 = inputInteger("enter the id");
                    removeProductById(id2);
                    break;
                case 6:
                    return;
            }
            saveObjectToFile();
        }
    }

    public int inputInteger(String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }

    public String inputString(String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    public void saveObjectToFile(){
        ObjectOutputStream oss = null;
        try{
            oss = new ObjectOutputStream(new FileOutputStream("product.dat"));
            oss.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (oss != null) {
                    oss.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
