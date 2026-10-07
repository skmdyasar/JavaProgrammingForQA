package StringPrograms;

public class P008_RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "The sky  is in Blue e e  ";
        removeWhiteSpaces(str);
    }
    public static void removeWhiteSpaces(String str){
        System.out.println("Before "+str);
        // str = str.trim();
        str = str.replaceAll("\\s+", "");
        System.out.println("After "+str);
    }
}
