package Arrays;

import java.util.Arrays;

public class P010_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 8, -2, 3, 2};
        System.out.println("Array Before Sort "+Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Array After Sort "+Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
