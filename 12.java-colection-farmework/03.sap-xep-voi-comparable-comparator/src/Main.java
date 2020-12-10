import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kien", 30, "HT");
        Student student1 = new Student("Nam", 29, "HT");
        Student student2 = new Student("Anh", 31, "HT");
        Student student3 = new Student("Tung", 27, "HT");

        LinkedList<Student> lists = new LinkedList<>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);

        Collections.sort(lists);
        for (Student st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sanh theo tuoi");
        for (Student st : lists){
            System.out.println(st.toString());
        }
    }
}
