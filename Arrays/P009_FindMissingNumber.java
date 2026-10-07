package Arrays;

public class P009_FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 3, 7, 5};
        missingNumber(arr);
    }
    public static void missingNumber(int[] arr){
        int n = arr.length+1;
        int expectedSum = (n*((n+1)/2));
        int arrSum = 0;

        for(int num : arr){
            arrSum += num;
        }

        System.out.println("The Missing Number in an array is "+(expectedSum-arrSum));
    }
}
