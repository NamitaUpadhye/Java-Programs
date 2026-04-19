package Collection;
import java.util.*; 
public class MapInterfaceDemo {
    public static void main(String[] args) {

        // HashMap Demonstration
        System.out.println("=== HashMap Demonstration ===");
        Map<String, Integer> hashMap = new HashMap<>();

        // 1. Basic Operations
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Orange", 3);
        System.out.println("Initial HashMap: " + hashMap);

        // Updating value
        hashMap.put("Apple", 5);
        System.out.println("After updating Apple's value: " + hashMap);

        // putIfAbsent
        hashMap.putIfAbsent("Apple", 10);
        hashMap.putIfAbsent("Grape", 4);
        System.out.println("After putIfAbsent: " + hashMap);

        // 2. Accessing Elements
        System.out.println("\nAccessing Elements:");
        System.out.println("Value for Apple: " + hashMap.get("Apple"));
        System.out.println("Value for missing key: " + hashMap.get("Mango"));
        System.out.println("Value with default: " + hashMap.getOrDefault("Mango", 0));

        // 3. Removing Elements
        hashMap.remove("Banana");
        System.out.println("After removing Banana: " + hashMap);

        hashMap.remove("Apple", 5);
        System.out.println("After conditional remove: " + hashMap);

        // 4. TreeMap Demonstration
        System.out.println("\n=== TreeMap Demonstration ===");

        TreeMap<String, Integer> scores = new TreeMap<>();
        scores.put("Alice", 95);
        scores.put("Bob", 82);
        scores.put("Charlie", 90);
        scores.put("David", 78);
        scores.put("Eva", 88);

        System.out.println("TreeMap contents: " + scores);
        System.out.println("Charlie's score: " + scores.get("Charlie"));

        scores.remove("David");
        System.out.println("After removing David: " + scores);

        System.out.println("First entry: " + scores.firstEntry());
        System.out.println("Last entry: " + scores.lastEntry());

        // Natural ordering example
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Zebra", 1);
        treeMap.put("Lion", 2);
        treeMap.put("Elephant", 3);
        System.out.println("TreeMap sorted: " + treeMap);

        // 5. LinkedHashMap Demonstration
        System.out.println("\n=== LinkedHashMap Demonstration ===");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>() {
            protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                return size() > 3;
            }
        };

        linkedHashMap.put("A", 1);
        linkedHashMap.put("B", 2);
        linkedHashMap.put("C", 3);
        System.out.println("Initial LinkedHashMap: " + linkedHashMap);

        linkedHashMap.put("D", 4);
        System.out.println("After adding D: " + linkedHashMap);

        // 6. Iteration
        System.out.println("\n=== Map Iteration ===");

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key);
        }

        for (Integer value : hashMap.values()) {
            System.out.println("Value: " + value);
        }

        // 7. Merge Operations
        System.out.println("\n=== Map Operations ===");

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        map2.forEach((key, value) ->
                map1.merge(key, value, (v1, v2) -> v1 + v2));

        System.out.println("After merging: " + map1);

        // 8. Compute Operations
        map1.compute("A", (k, v) -> (v == null) ? 1 : v * 2);
        System.out.println("After compute A: " + map1);

        map1.computeIfPresent("B", (k, v) -> v * 3);
        System.out.println("After computeIfPresent B: " + map1);

        map1.computeIfAbsent("D", k -> 10);
        System.out.println("After computeIfAbsent D: " + map1);

        // 9. Bulk Operations
        System.out.println("\n=== Bulk Operations ===");

        Map<String, Integer> newMap = new HashMap<>();
        newMap.putAll(map1);
        System.out.println("After putAll: " + newMap);

        newMap.clear();
        System.out.println("After clearing: " + newMap);

        // 10. Checking Operations
        System.out.println("\n=== Checking Operations ===");

        System.out.println("Is empty? " + newMap.isEmpty());
        System.out.println("Size: " + map1.size());
        System.out.println("Contains key A? " + map1.containsKey("A"));
        System.out.println("Contains value 1? " + map1.containsValue(1));
    }
}