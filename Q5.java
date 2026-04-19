package lab3b;

public class Q5 {
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        System.out.println(removeWhitespace("Hello World"));
    }
}