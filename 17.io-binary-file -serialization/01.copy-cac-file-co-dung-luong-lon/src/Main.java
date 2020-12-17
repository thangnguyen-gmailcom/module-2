import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter source file:");
        String sourcePath = scanner.nextLine();
        System.out.println("Enter destination file:");
        String destPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try {
            copyFileUsingStream(sourceFile,destFile);
            System.out.printf("Copy completed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copyFileUsingStream(File source, File dest) throws  IOException{
        InputStream is = null;
        OutputStream os = null;

        try {
            File file;
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] data = new byte[1024];
            int length;
            while ((length = is.read(data)) != -1){
                os.write(data,0,length);
            }
        }finally {
            if(is != null){
                is.close();
            }
            if(os != null){
                os.close();
            }
        }
    }
}
