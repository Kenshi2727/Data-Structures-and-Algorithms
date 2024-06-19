import java.util.HashMap;
import java.util.Map.Entry;

public class hashMapFunctions {
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap=new HashMap<>() ;
        //put function
        hashmap.put(1,"Abhishek");
        hashmap.put(3,"Ayisha");
        hashmap.put(5,"niggs");
        hashmap.put(8,"thala");  
        System.out.println("Hashmap of the given data is:"+hashmap);
            
        //get function
        String result=hashmap.get(3);
        System.out.println("Value for the given key is:"+result); 

        //containsKey function
        System.out.println(hashmap.containsKey(2));
        
        //remove function
        hashmap.remove(1);
        System.out.println("Updated hashMap:"+hashmap); 

        //iterating using the for loop
         System.out.println("HashMap is: ");
        for(Entry<Integer, String> e: hashmap.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }
     }
}

