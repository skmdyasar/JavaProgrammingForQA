package Arrays;

public class P001_FindLargestNumber {
    public static void main(String[] args) {
        int arr[] = {100, 9, 7, 10, 14, 15, 2, 1, 8, 0};
        findLargestNumber(arr);
    }

    public static void findLargestNumber(int[] arr) {
        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > largestNumber){
                secondLargestNumber = largestNumber;
                largestNumber = num;
            } else if(num > secondLargestNumber && num != largestNumber){
                secondLargestNumber = num;
            }
        }
        System.out.println("The Largest Number is "+largestNumber);
        System.out.println("The Second Largest Number is "+secondLargestNumber);
    }
}
