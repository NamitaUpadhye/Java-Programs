package ArrayList;
import java.util.*;

public class ListInterfaceDemo {
        // 1. Adding elements
	    public static void addElements(List<String> list) {
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Orange");
	        System.out.println("After adding elements: " + list);
	    }

	    // 2. Add element at specific index
	    public static void addAtIndex(List<String> list) {
	        list.add(1, "Mango");
	        System.out.println("After adding at index 1: " + list);
	    }

	    // 3. Add multiple elements
	    public static void addMultiple(List<String> list) {
	        List<String> newList = Arrays.asList("Grapes", "Pineapple");
	        list.addAll(newList);
	        System.out.println("After adding multiple elements: " + list);
	    }

	    // 4. Access elements
	    public static void accessElements(List<String> list) {
	        System.out.println("Element at index 2: " + list.get(2));
	    }

	    // 5. Update elements
	    public static void updateElement(List<String> list) {
	        list.set(0, "Strawberry");
	        System.out.println("After update: " + list);
	    }

	    // 6. Remove elements
	    public static void removeElement(List<String> list) {
	        list.remove("Banana");
	        System.out.println("After removing Banana: " + list);
	    }

	    // 7. Search element
	    public static void searchElement(List<String> list) {
	        System.out.println("Contains Apple? " + list.contains("Apple"));
	    }

	    // 8. List size
	    public static void listSize(List<String> list) {
	        System.out.println("Size of list: " + list.size());
	    }

	    // 9. Iterate using for-each
	    public static void iterateList(List<String> list) {
	        System.out.println("Iterating list:");
	        for (String item : list) {
	            System.out.println(item);
	        }
	    }

	    // 10. Using Iterator
	    public static void useIterator(List<String> list) {
	        System.out.println("Using Iterator:");
	        Iterator<String> it = list.iterator();
	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }
	    }

	    // 11. Sorting
	    public static void sortList(List<String> list) {
	        Collections.sort(list);
	        System.out.println("After sorting: " + list);
	    }

	    // 12. Sublist
	    public static void subList(List<String> list) {
	        List<String> sub = list.subList(0, 2);
	        System.out.println("Sublist: " + sub);
	    }

	    // 13. Clearing list
	    public static void clearList(List<String> list) {
	        list.clear();
	        System.out.println("List cleared: " + list);
	    }

	    public static void main(String[] args) {

	        System.out.println("----- ArrayList -----");
	        List<String> arrayList = new ArrayList<>();
	        runAll(arrayList);

	        System.out.println("\n----- LinkedList -----");
	        List<String> linkedList = new LinkedList<>();
	        runAll(linkedList);
	    }

	    public static void runAll(List<String> list) {
	        addElements(list);
	        addAtIndex(list);
	        addMultiple(list);
	        accessElements(list);
	        updateElement(list);
	        removeElement(list);
	        searchElement(list);
	        listSize(list);
	        iterateList(list);
	        useIterator(list);
	        sortList(list);
	        subList(list);
	        clearList(list);
	    }
	}

