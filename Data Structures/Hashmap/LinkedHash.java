import java.util.*;
public class LinkedHash {
    public static void main(String[] args) {
        HashMap<Integer, String> map= new HashMap<>();
        map.put(3, "Priya");
        map.put(1, "Rahul");
        map.put(2, "Ravi");
        map.put(4, "Rahul");

        System.out.println("Hashmap looks like: "+map);


LinkedHashMap<Integer, String> map1= new LinkedHashMap<>();
map1.put(3, "Priya");
map1.put(1, "Rahul");
map1.put(2, "Ravi");
map1.put(4, "Rahul");

System.out.println("LinkedHashmap looks like(order retained): "+map1);

TreeMap<Integer, String> map2= new TreeMap<>();
map2.put(3, "Priya");
map2.put(1, "Rahul");
map2.put(2, "Ravi");
map2.put(4, "Rahul");
map2.put(7,"Dino");
map2.put(-1,"Miss Dino");

System.out.println("Treemap looks like(sorted on 'key' basis): "+map2);
}
}
