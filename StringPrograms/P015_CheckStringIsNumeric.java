package StringPrograms;


public class P015_CheckStringIsNumeric {
    public static void main(String[] args) {
        System.out.println(StringIsNumeric("2026"));
    }
    public static boolean StringIsNumeric(String str) {
        if (str == null || str.isEmpty()) return false;
        // int start = (str.charAt(0) == '-' || str.charAt(0) == '+') ? 1 : 0;
        // if (start == 1 && str.length() == 1) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
