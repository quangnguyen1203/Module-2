import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapLinkedHashMapTreeMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Thien", 20);
        hashMap.put("Quang", 21);
        hashMap.put("Long", 19);
        hashMap.put("Nam", 18);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");
        System.out.println("************************************");
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        System.out.println("************************************");
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Thien", 20);
        linkedHashMap.put("Quang", 21);
        linkedHashMap.put("Long", 19);
        linkedHashMap.put("Nam", 18);
        System.out.println("\nThe age for " + "Quang is " + linkedHashMap.get("Quang"));
    }
}
