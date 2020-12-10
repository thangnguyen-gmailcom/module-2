import java.util.*;

public class Main {
//    public static void main(String[] args) {
//        HashMap<String, Integer> hashMap = new HashMap<>();
//        hashMap.put("A" , 19);
//        hashMap.put("C", 20);
//        hashMap.put("B", 18);
//
//        Set<String> keys = hashMap.keySet();
//        for(String key : keys){
//            System.out.println(key + " " + hashMap.get(key));
//        }
//
//        TreeMap<String,Integer> treeMap = new TreeMap<>(Collections.reverseOrder());
//        treeMap.put("A" , 19);
//        treeMap.put("C", 20);
//        treeMap.put("B", 18);
//        System.out.println(treeMap);
//
//        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
//        linkedHashMap.put("A",20);
//        linkedHashMap.put("B",24);
//        linkedHashMap.put("D",22);
//        linkedHashMap.put("C",21);
//        System.out.println(linkedHashMap);
//    }
public static void main(String[] args) {
    LinkedHashMap<Integer, Integer> linkedMap = new LinkedHashMap<Integer, Integer>();
    for (int i = 0; i < 10; i++) {
        linkedMap.put(i, i);
    }

    System.out.println(linkedMap);
    // Least-recently used order:
    linkedMap = new LinkedHashMap<Integer, Integer>(16, 0.75f, true);

    for (int i = 0; i < 10; i++) {
        linkedMap.put(i, i);
    }
    System.out.println(linkedMap);
    for (int i = 0; i < 7; i++)
        System.out.println(linkedMap.get(i));
    System.out.println(linkedMap);
}
}
