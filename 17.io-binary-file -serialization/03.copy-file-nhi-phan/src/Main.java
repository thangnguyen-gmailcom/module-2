import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter source file...");
        String sourcePath = scanner.nextLine();
        System.out.println("Enter target file...");
        String targetPath = scanner.nextLine();

//        File sourceFile = new File(sourcePath);
//        File targetFile = new File(targetPath);

        try {
            copyFile(sourcePath,targetPath);
            System.out.println("copy file ok !");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void copyFile(String source, String target) throws IOException {
       FileInputStream fis= null;
        FileOutputStream fos = null;
        try {
            File file = new File(source) ;
            if(!file.exists()){
                System.out.print("file is not exists");
            }
            File file1 = new File(target);
            fis = new FileInputStream(file);
            fos = new FileOutputStream(file1);
            byte[] data = new byte[2048];
            int length;
            while ((length = fis.read(data))!= -1){
                fos.write(data,0,length);
            }
            fos.flush();
            System.out.println("length :" + file.length());
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fis != null){
                fis.close();
            }

            if(fos != null){
                fos.close();
            }
        }
    }
}
