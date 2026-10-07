package Arrays;

public class P002_FindSmallestNumber {
    public static void main(String[] args) {
        int arr[] = {-7, 9, 8, 5, 15, 3, 8};
        findSmallestNumber(arr);
    }


    public static void findSmallestNumber(int[] arr){
        int smallestNumber = Integer.MAX_VALUE;
        int secondSmallestNumber = Integer.MAX_VALUE;

        for(int num : arr){
            if(num < smallestNumber){
                secondSmallestNumber = smallestNumber;
                smallestNumber = num;
            }else if(num < secondSmallestNumber && num != smallestNumber){
                secondSmallestNumber = num;
            }
        }
        System.out.println("The Smallest Number is "+smallestNumber);
        System.out.println("The Second Smallest Number is "+secondSmallestNumber);
    }
}
