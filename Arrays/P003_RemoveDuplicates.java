package Arrays;

import java.util.HashSet;
import java.util.Set;

public class P003_RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9 ,10};
        removeDuplicates(arr);
    }

    public static void removeDuplicates(int[] arr){
        Set<Integer> nums = new HashSet<>();
        for(int i : arr){
            nums.add(i);
        }

        System.out.println(nums);
    }
}
