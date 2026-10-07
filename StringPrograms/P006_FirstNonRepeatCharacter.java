package StringPrograms;

import java.util.*;

public class P006_FirstNonRepeatCharacter {
    /*
        Example 1
            "s": "leetcode"
            Expected Output: 'l'

        Example 2
            "s": "loveleetcode"
            Expected Output: 'v'

        Example 3 (All characters repeat)
            "s": "aabb"
            Expected Output: No non-repeated character found.
    */
    public static void main(String[] args) {
        String str1 = "Yasar";
        String str2 = "loveleetcode";
        String str3 = "aabb";
        firstNonRepeatCharacter(str1);
        firstNonRepeatCharacter(str2);
        firstNonRepeatCharacter(str3);
    }

    public static void firstNonRepeatCharacter(String str) {
        // str = str.replaceAll(" ", "");
        Map<Character, Integer> freq = new LinkedHashMap<Character, Integer>();

        for(char ch : str.toLowerCase().toCharArray()){
            if(freq.containsKey(ch)){
                freq.put(ch, freq.get(ch)+1);
            } else {
                freq.put(ch,1);
            }
        }

        System.out.println(freq);

        for(Map.Entry<Character, Integer> entry : freq.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey()+" : "+entry.getValue());
                break;
            }
            
        }
    }
}
