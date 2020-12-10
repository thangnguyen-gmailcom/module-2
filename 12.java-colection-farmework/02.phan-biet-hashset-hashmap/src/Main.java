import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nguyen Van A",22,"TP-Hue");
        Student student2 = new Student("Nguyen Van C", 21, "TP-Hue");
        Student student3 = new Student("Nguyen Van B", 23,"TP-Hue");

        Map<Integer, Student> hashMap = new HashMap<Integer, Student>();
        hashMap.put(1,student1);
        hashMap.put(2,student2);
        hashMap.put(3,student3);
        hashMap.put(4,student1);
        for(Map.Entry<Integer,Student> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Set<Student> hashSet = new HashSet<Student>();
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        hashSet.add(student1);
        Iterator<Student> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
