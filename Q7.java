package lab3c;

public class Q7 {
	    public static String truncate(String str, int length) {
	        if (str.length() <= length) return str;
	        return str.substring(0, length) + "...";
	    }
	    public static void main(String[] args) {
	        System.out.println(truncate("HelloWorld", 5));
	    }
	}