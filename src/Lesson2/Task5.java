package Lesson2;
import java.util.Arrays;
public class Task5 {
    public static void main(String[] args) {
        int [] array = {1,2,4,15,8,3,0};
        int min = array [0];
        int max = array [0];
        for (int i = 1; i < array.length; i++) {

            min = Math.min(min, array[i]);
            max = Math.max(max, array[i]);
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }




}
