package lab1b;
import java.util.*;

public class Remove{
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        int n = 1; 
        colors.remove(n);
        System.out.println(colors);
    }
}