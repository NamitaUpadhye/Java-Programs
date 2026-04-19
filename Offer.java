package lab1cLinkedList;
import java.util.*;
public class Offer {
	    public static void main(String[] args) {
	        LinkedList<String> l_listobj = new LinkedList<>();
	        l_listobj.add("Red");
	        l_listobj.add("Blue");
	        l_listobj.offerLast("Pink");
	        System.out.println("After adding at end:");
	        System.out.println(l_listobj);
	    }
	}

