package OtherPrograms;

public class P001_StringConevrsion {
    public static void main(String[] args) {
        String str1 = "yasar";
        // convertEvenToUpperOddToLower(str1);
        conertOnlyFirstCharToUpper(str1);
        
    }

    public static void convertEvenToUpperOddToLower(String str){
        String result = "";

        for(int i=0; i<str.length(); i++){
            if(i%2 == 0){
                result += Character.toUpperCase(str.charAt(i));
            } else {
                result += Character.toLowerCase(str.charAt(i));
            }
        }

        System.out.println("The result is "+result);
    }

    public static void conertOnlyFirstCharToUpper(String str){
        System.out.println(Character.toUpperCase(str.charAt(0))+str.substring(1));
    }
    
}
