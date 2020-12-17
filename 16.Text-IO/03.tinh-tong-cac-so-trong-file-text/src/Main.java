import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("nhap duong dan file ...");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        Main readfileEx = new Main();
        readfileEx.readFileText(path);
    }

    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException(file.getName());
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int sum = 0;
            while ((line = br.readLine()) != null) {
                int value = Integer.parseInt(line);
                sum += value;
            }
            br.close();
            System.out.println("sum: " + sum);
        }catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }
}
