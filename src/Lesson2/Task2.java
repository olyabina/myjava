package Lesson2;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int [] array = new int[8];
        int value = 0;
        for (int i = 0; i < array.length; i++) {
            value += 3;
            array [i] = value;
        }
        System.out.println(Arrays.toString(array));
    }
}
