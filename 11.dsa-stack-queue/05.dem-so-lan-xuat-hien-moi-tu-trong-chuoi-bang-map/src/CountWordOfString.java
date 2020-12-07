import java.util.Set;
import java.util.TreeMap;

public class CountWordOfString {
    public static void main(String[] args) {
        String str = "Lorem Ipsum Is Simply Dummy Text Of The Printing And Typesetting Industry";
        TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
        String result = str.toUpperCase();
        for (int i = 0; i < str.length() ; i++) {
            char current = result.charAt(i);
            checkStr(map,current);
        }

        Set<Character> keys = map.keySet();
        for (Character key : keys) {
            System.out.println(key + ": " + map.get(key));
        }
    }

    public static void checkStr(TreeMap<Character,Integer> map, char chars){
        if(map.containsKey(chars)) {
            int count = map.get(chars) + 1;
            map.put(chars,count);
        }else {
            map.put(chars,1);
        }
    }
}
