// Find Pairs with a given sum
package Arrays;
import java.util.*;

public class P014_FindTwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, 8, 9};
        int targetSum = 7;

        int[] result = findTwoSum(arr, targetSum);
        
        System.out.println(Arrays.toString(result));
    }

    static int[] findTwoSum(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int [] {i, j};
                }
            }
        }
        return new int []{};
    }

}
