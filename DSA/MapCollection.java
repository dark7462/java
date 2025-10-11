
import java.util.*;

public class MapCollection {
    public static void main(String[] args) {
        HashMap <String, Integer> map = new HashMap<>();
        // key value pair data structure, used to store freq of pair of data
        map.put("Anurag", 10);
        map.put("Renuka", 20);
        map.put("Piyush", 30);
        map.put("Harsh", 40);
        map.put("Anurag",365); // it'll replace the exiting pair and update the value now

        System.out.println(map);
        // coutld normally print it 

        //O(1) Look ups using key to fetch the values
        System.out.println(map.get("Anurag"));

        //keyset -> makes a set of all the unique element which are keys to the values
        System.out.println(map.keySet());

        for(String key : map.keySet()){ // fetch each value from the set of keys
            System.out.println(key + " : " + map.get(key)); // geting values for the keys
        }
        
    }
}
