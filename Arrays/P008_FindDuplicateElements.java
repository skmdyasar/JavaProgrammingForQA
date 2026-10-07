package Arrays;
import java.util.*;

public class P008_FindDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 2, 8, 5, 2, 9, 3, 1};
        findDuplicateElements(arr);
    }
    public static void findDuplicateElements(int[] arr){
        Set<Integer> unique = new LinkedHashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>();

        for(int num : arr){
            if(!unique.add(num)) duplicates.add(num);
        }

        System.out.println("The Unique Elements are "+unique);
        System.out.println("The Duplicate Elements are "+duplicates);
    }
}
