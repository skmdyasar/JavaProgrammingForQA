package StringPrograms;

import java.util.*;

public class P010_FindDuplicateCharacters {
    public static void main(String[] args) {
        String str= "programming";
        findDupCharactersOne(str);
        findDupCharactersBySet(str);
    }

    public static void findDupCharactersOne(String str){
        Map<Character, Integer> freq = new HashMap<Character, Integer>();

        for(char ch : str.toLowerCase().toCharArray()){
            if(freq.containsKey(ch)){
                freq.put(ch, freq.get(ch)+1);
            } else {
                freq.put(ch, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : freq.entrySet()){
            if(entry.getValue()>1){
                System.out.println("The duplicate characters are "+entry.getKey());
            }
        }
    }

    public static void findDupCharactersBySet(String str){
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        for(char ch : str.toLowerCase().toCharArray()){
            // seen.add(ch);
            if(!seen.add(ch)){
                duplicates.add(ch);
            }
        }
        System.out.println("The duplicates elements are "+duplicates);
    }
}
