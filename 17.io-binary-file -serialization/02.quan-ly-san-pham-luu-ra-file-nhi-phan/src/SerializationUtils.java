import java.io.*;

public class SerializationUtils {
    /**
     * Serialize the given object and save it to given file
     */
    public static void serialize(Object obj, String fileName) throws IOException {
        FileOutputStream fos = new FileOutputStream(getFileObject(fileName));
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(obj);
        oos.close();
    }

    /**
     * Deserialize to Object from given file
     */
    public static Object deserialize(String fileName) throws IOException, ClassNotFoundException {
        File file=new File(fileName);
        if (!file.exists()) return null;
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Object obj = ois.readObject();
        ois.close();
        return obj;
    }

    private static File getFileObject(String fileName){
        return new File(fileName);
    }
}

