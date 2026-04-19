package lab3c;

public class Q8 {
	    public static boolean isNumeric(String str) {
	        return str.matches("\\d+");
	    }

	    public static void main(String[] args) {
	        System.out.println(isNumeric("12345"));
	    }
	}

