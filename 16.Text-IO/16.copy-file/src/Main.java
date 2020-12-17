import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file;
        FileWriter fw = null;
        BufferedWriter bw = null;
        FileWriter fw2 = null;
        BufferedWriter writer = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fw = new FileWriter("source.txt");
            bw = new BufferedWriter(fw);
            fw2 = new FileWriter("target.txt");
            writer = new BufferedWriter(fw2);
            bw.write("do quang phuoc \n" );
            bw.write("phu thinh \n");
            bw.write("nguyen hai \n");
            bw.close();
            fr = new FileReader("source.txt");
            br = new BufferedReader(fr);
            int c;
            while ((c = br.read()) != -1){
                writer.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            br.close();
            writer.close();
        }
    }
}
