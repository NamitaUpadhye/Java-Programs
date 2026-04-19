package lab1b;
import java.util.*;
public class SortColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        Collections.sort(colors);
        System.out.println("Sorted list: " + colors);
    }
}