package lab1cLinkedList;
import java.util.*;
public class Reverse {
	    public static void main(String[] args) {
	        LinkedList<String> objlist = new LinkedList<>();
	        objlist.add("Red");
	        objlist.add("Blue");
	        objlist.add("Green");
	        Iterator<String> it = objlist.descendingIterator();
	        System.out.println("Reverse order:");
	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }
	    }
	}
