package Arrays;
import java.util.*;

public class P005_PrintEvenOddIndexes {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        printEvenOddIndexes(arr);
    }

    public static void printEvenOddIndexes(int[] arr){
        List<Integer> evenElements = new LinkedList<>();
        List<Integer> oddElements = new LinkedList<>();

        for(int i = 0; i<arr.length; i+=2){
            evenElements.add(arr[i]);
        }

        for(int i = 1; i<arr.length; i+=2){
            oddElements.add(arr[i]);
        }

        System.out.println("The Even Index elements are "+evenElements);
        System.out.println("The Odd Index elements are "+oddElements);
    }
}
