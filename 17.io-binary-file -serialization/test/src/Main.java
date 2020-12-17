import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            File file;
            fos = new FileOutputStream("student.txt");
            oos = new ObjectOutputStream(fos);
            Student student = new Student("phuoc", 19);
            Student student1 = new Student("thinh", 20);
            oos.writeObject(student);
            oos.writeObject(student1);
            fis = new FileInputStream("student.txt");
            ois = new ObjectInputStream(fis);
            fis.readAllBytes();
            Student student2 = (Student) ois.readObject();
            Student student3 = (Student) ois.readObject();
            System.out.println(student2.toString());
            System.out.println(student3.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                fos.close();
            }

            if (oos != null) {
                oos.close();
            }
        }
    }
}
