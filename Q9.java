package lab3c;
import java.util.Random;
public class Q9 {
	    public static String generateRandomString(int length) {
	        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        StringBuilder result = new StringBuilder();
	        Random rand = new Random();

	        for (int i = 0; i < length; i++) {
	            result.append(chars.charAt(rand.nextInt(chars.length())));
	        }
	        return result.toString();
	    }

	    public static void main(String[] args) {
	        System.out.println(generateRandomString(8));
	    }
	}

