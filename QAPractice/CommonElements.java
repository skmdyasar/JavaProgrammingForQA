package QAPractice;
import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {7, 8, 2, 9, 6};

        Set<Integer> ele = new HashSet<>();
        for(int i : arr1){
            ele.add(i);
        }

        Set<Integer> commonEle = new HashSet<>();
        for(int i : arr2){
            if(ele.contains(i)){
                commonEle.add(i);
            }
        }
        System.out.println(commonEle);
    }
}
