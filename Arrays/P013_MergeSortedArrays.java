package Arrays;

import java.util.Arrays;

public class P013_MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 10};
        mergeSortedArrays(arr1, arr2);
    }

    public static void mergeSortedArrays(int[] arr1, int[] arr2){
        int[] result = new int [arr1.length+arr2.length];
        int index = 0;

        for(int num : arr1){
            result[index++] = num;
        }

        for(int num : arr2){
            result[index++] = num;
        }

        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
    }
}
