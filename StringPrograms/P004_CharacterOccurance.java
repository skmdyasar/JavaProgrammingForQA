package StringPrograms;
import java.util.*;

public class P004_CharacterOccurance {
    public static void main(String[] args) {
        String str = "Ya sar";
        str = str.replaceAll(" ", "");
        Map<Character, Integer> freq = new HashMap<Character, Integer>();

        for(char ch : str.toLowerCase().toCharArray()){
            if(freq.containsKey(ch)){
                freq.put(ch, freq.get(ch)+1);
            } else {
                freq.put(ch,1);
            }
        }

        System.out.println(freq);

        for(Map.Entry<Character, Integer> entry : freq.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
