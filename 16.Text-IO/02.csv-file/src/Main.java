import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file;
        FileReader fr = null;
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        try {
            fr = new FileReader("csv.txt");
            br = new BufferedReader(fr);
            while ((line = br.readLine()) != null){
                String[] country = line.split(cvsSplitBy);
                System.out.println(country[4] + cvsSplitBy + country[5]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(br != null){
                br.close();
            }
        }
    }
}
