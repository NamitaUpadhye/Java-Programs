package lab3c;

public class Capitalize {
	    public static String capitalizeWords(String str) {
	        String[] words = str.split("\\s+");
	        StringBuilder result = new StringBuilder();

	        for (String word : words) {
	            result.append(Character.toUpperCase(word.charAt(0)))
	                  .append(word.substring(1).toLowerCase())
	                  .append(" ");
	        }
	        return result.toString().trim();
	    }
	    public static void main(String[] args) {
	        System.out.println(capitalizeWords("java programming language"));
	    }
	}
