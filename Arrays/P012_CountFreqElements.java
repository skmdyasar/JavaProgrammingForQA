package Arrays;
import java.util.*;

public class P012_CountFreqElements {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 2, 8, 5, 2, 9, 3};
        countFrequency(arr);
    }
    public static void countFrequency(int[] arr){
        Map<Integer, Integer> freq = new LinkedHashMap<>();

        for(int num : arr){
            if(freq.containsKey(num)){
                freq.put(num, freq.get(num)+1);
            } else {
                freq.put(num, 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            System.err.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
