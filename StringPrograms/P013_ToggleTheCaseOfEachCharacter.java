package StringPrograms;

public class P013_ToggleTheCaseOfEachCharacter {
    public static void main(String[] args) {
        String str = "Java 2026! @Code";
        System.out.println(toggleCharacterCase(str));
    }

    public static String toggleCharacterCase(String str) {
        String result = "";
        for(char ch : str.toCharArray()){
            if(Character.isUpperCase(ch)){
                result += Character.toLowerCase(ch);
            } else if(Character.isLowerCase(ch)){
                result += Character.toUpperCase(ch);
            } else {
                result += ch;
            }
        }
        return result;
    }
}
