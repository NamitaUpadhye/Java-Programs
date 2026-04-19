package lab1cLinkedList;
import java.util.*;
public class List1 {
	    public static void main(String[] args) {
	        LinkedList<String> listobj = new LinkedList<>();
	        listobj.add("Red");
	        listobj.add("Blue");
	        listobj.add("Green");
	        listobj.add("Yellow");
	        Iterator<String> iteratorobj = listobj.listIterator(1);
	        System.out.println("Elements from 2nd position:");
	        while (iteratorobj.hasNext()) {
	            System.out.println(iteratorobj.next());
	        }
	    }
	}

