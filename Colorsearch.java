package lab1b;
import java.util.*;
public class Colorsearch {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");

        if (colors.contains("Red")) {
            System.out.println("Red is available");
        } else {
            System.out.println("Red is not available");
        }
    }
}
