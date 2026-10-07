package Arrays;

public class P007_ArraySorted {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {10, 30, 20, 40, 50};

        System.out.println(checkArraySort(arr1));
        System.out.println(checkArraySort(arr2));
    }

    public static boolean checkArraySort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
