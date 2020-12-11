import java.util.*;

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
                case 6 :
                    sortProductByPrice();
                    break;
                case 7:
                    System.out.println("Tạm biệt");
                    System.exit(7);
                    break;
            }
        }
    }

    public static void addProduct() {
        String productName = scannerString("Nhập tên sản phẩm :");
        String dateOfManufacture = scannerString("Ngày sản xuất : ");
        String expiryDate = scannerString("Hạn sử dụng :");
        int price = scannerInteger("Nhập giá:");
        ProductManager.addProduct(productName,dateOfManufacture,expiryDate,price);
    }

    public static void getProduct() {
        int id = scannerInteger("Nhap id");
        Product product = ProductManager.getProductById(id);
        String productName1 = scannerString("nhập tên sản phẩm");
        String dateOfManufacture1 = scannerString("Ngày sản xuất");
        String expiryDate1 = scannerString("Hạn sử dụng");
        int price1 = scannerInteger("giá");
        product.setProductName(productName1);
        product.setDateOfManufacture(dateOfManufacture1);
        product.setExpiryDate(expiryDate1);
        product.setPrice(price1);
    }

    public static void removeProduct(){
        int id = scannerInteger("nhập id :");
        ProductManager.removeProduct(id);
    }

    public static void show(){
        ProductManager.showProduct();
    }
    public static void showProductByName(){
        String name = scannerString("Nhập tên sản phẩm : ");
        ProductManager.showProductByName(name);
    }

    public static void sortProductByPrice() {
        Collections.sort(ProductManager.products);
        show();
    }

    public static String scannerString(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        String st = sc.nextLine();
        return st;
    }

    public static int scannerInteger(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        int st = sc.nextInt();
        sc.nextLine();
        return st;
    }
}
