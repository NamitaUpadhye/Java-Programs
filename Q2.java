package lab3b;

public class Q2 {
	    public static int countOccurrences(String mainStr, String subStr) {
	        int count = 0;
	        int index = 0;

	        while ((index = mainStr.indexOf(subStr, index)) != -1) {
	            count++;
	            index += subStr.length();
	        }
	        return count;
	    }
	    public static void main(String[] args) {
	        System.out.println(countOccurrences("hello hello hi", "hello"));
	    }
	}
