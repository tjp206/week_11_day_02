import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
//        HashMap favouriteFruits = new HashMap<String, String>();
        Map<String, Integer> ages = new HashMap<String, Integer>();
//        favouriteFruits.put("Alice", "Apple");
//        favouriteFruits.put("Sarah", "Banana");
//        favouriteFruits.put("Bob", "Strawberry");
        ages.put("Alice", 52);
        ages.put("Bob", 24);

        Object aliceAge = ages.get("Alice");

//        System.out.println(favouriteFruits.get("Alice"));
        System.out.println(aliceAge.toString());

//        ages.put(key, value); // insert into hashmap
//        ages.get(key); // get value associated with key
//        ages.size(); // return size of an integer
//        ages.clear(); // clears all entries
//        ages.containsValue(value); // return true if hashmap contains the value
//        ages.remove(key); // removes entry with given key
    }
}
