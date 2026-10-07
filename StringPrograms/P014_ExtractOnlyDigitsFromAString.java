package StringPrograms;

public class P014_ExtractOnlyDigitsFromAString {
    public static void main(String[] args) {

        String str = "Phone: +1-555-0199";
        System.out.println(DigitExtarcter(str));
    }

    public static String DigitExtarcter(String str) {
        String strDigit = "";
        for(char ch : str.toCharArray()){
            if(Character.isDigit(ch)){
                strDigit += ch;
            }
        }

        return strDigit;
    }
}
