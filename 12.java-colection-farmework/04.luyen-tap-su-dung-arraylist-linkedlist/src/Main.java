import java.util.Properties;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chiceNumber;
        for (; ; ) {
            System.out.println("1.thêm sản phẩm");
            System.out.println("2.Sửa thông tin sản phẩm");
            System.out.println("3.Xóa sản phẩm theo id");
            System.out.println("4.Hiển thị danh sách sản phẩm");
            System.out.println("5.Tìm kiếm theo tên sản phẩm");
            System.out.println("6.Sắp xếp sản phẩm");
            System.out.println("7.Thoát");

            do {
                System.out.println("bấm số để nhọn");
                chiceNumber = sc.nextInt();
            } while ((chiceNumber < 1) || (chiceNumber > 7));

            switch (chiceNumber) {
                case 1:
                    System.out.println("Bạn chọn chức năng nhập :");
                    addProduct();
                    break;
                case 2:
                    getProduct();
                    break;
                case 3:
                    removeProduct();
                    break;
                case 4:
                    show();
                    break;
                case 5 :
                    showProductByName();
                    break;
                case 7:
                    System.out.println("Tạm biệt");
                    System.exit(7);
                    break;
            }
        }
    }

    public static void addProduct() {
        Scanner sc = new Scanner(System.in);
        String productName = sc.nextLine();
        String dateOfManufacture = sc.nextLine();
        String expiryDate = sc.nextLine();
        int price = sc.nextInt();
        sc.nextLine();
        ProductManager.addProduct(productName,dateOfManufacture,expiryDate,price);
    }

    public static void getProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id :");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten san pham");
        Product product = ProductManager.getProductById(id);
        String productName1 = sc.nextLine();
        String dateOfManufacture1 = sc.nextLine();
        String expiryDate1 = sc.nextLine();
        int price1 = sc.nextInt();
        sc.nextLine();
        product.setProductName(productName1);
        product.setDateOfManufacture(dateOfManufacture1);
        product.setExpiryDate(expiryDate1);
        product.setPrice(price1);
    }

    public static void removeProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id :");
        int id = sc.nextInt();
        sc.nextLine();
        ProductManager.removeProduct(id);
    }

    public static void show(){
        ProductManager.showProduct();
    }
    public static void showProductByName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten san pham");
        String name = sc.nextLine();
        ProductManager.showProductByName(name);
    }
}
