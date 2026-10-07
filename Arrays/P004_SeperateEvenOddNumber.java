package Arrays;
import java.util.*;

public class P004_SeperateEvenOddNumber {
    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 9, 8, 90, 3};
        seperateEvenOddNumber(arr);
    }

    public static void seperateEvenOddNumber(int[] arr){
        int result[] = new int[arr.length];
        int index = 0;

        for(int num : arr){
            if(num % 2 == 0){
                result[index++] = num;
            }
        }

        for(int num : arr){
            if(num % 2 != 0){
                result[index++] = num;
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
