package StringPrograms;

public class P001_StringReverse{
    /* Test cases
        Example 1
            "s": "hello"
            Expected: "olleh"

        Example 2
            "s": "Hannah"
            Expected: "hannaH"
     */
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "Hannah";

        P001_StringReverse sr = new P001_StringReverse();
        System.out.println(sr.StringReverseByLoop(str1));
        System.out.println(sr.StringReverseByLoop(str2));
        System.out.println(StringReverseByLoopByStringBuilder(str1));
        System.out.println(StringReverseByLoopByStringBuilder(str2));
        System.out.println(StringReverseByLoopByTwoPointer(str1));
        System.out.println(StringReverseByLoopByTwoPointer(str2));
    }

    public String StringReverseByLoop(String value){
        String reverse = "";
        for(int i=value.length()-1; i>=0; i--){
            reverse = reverse+value.charAt(i);
        }
        return reverse;
    }

    public static String StringReverseByLoopByStringBuilder(String value){
        StringBuilder sb = new StringBuilder(value);
        return sb.reverse().toString();
    }

    public static String StringReverseByLoopByTwoPointer(String value){
        char ch[] = value.toCharArray();
        int left = 0;
        int right = value.length()-1;

        while (left<right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }

        return new String(ch);
    }
}