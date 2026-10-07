package Arrays;
import java.util.*;

public class P011_FindCommonElements {
    public static void main(String[] args) {
        int[] array1 = {4, 9, 5, 8, 4};
        int[] array2 = {9, 4, 9, 8, 2, 1};

        findCommonElements(array1, array2);
    }

    public static void findCommonElements(int[] arr1, int[] arr2){
        Set<Integer> array1 = new HashSet<>();
        Set<Integer> array2 = new HashSet<>();

        for(int num : arr1){
            array1.add(num);
        }

        for(int num : arr2){
            if(array1.contains(num)) array2.add(num);
        }

        System.out.println("The Common Elements are "+array2);
    }
}
