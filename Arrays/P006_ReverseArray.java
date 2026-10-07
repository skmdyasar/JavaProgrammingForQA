package Arrays;
import java.util.*;

public class P006_ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        System.out.println("Array Before Reverse "+Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Array After Reverse "+Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr){
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
