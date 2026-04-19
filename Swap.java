package lab1cLinkedList;
import java.util.*;
public class Swap {
	    public static void main(String[] args) {
	        LinkedList<String> l_list = new LinkedList<>();
	        l_list.add("Red");
	        l_list.add("Blue");
	        l_list.add("Green");
	        Collections.swap(l_list, 0, 2);
	        System.out.println("After swapping:");
	        System.out.println(l_list);
	    }
	}

