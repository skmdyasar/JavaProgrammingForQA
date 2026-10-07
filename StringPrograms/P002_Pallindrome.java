package StringPrograms;

public class P002_Pallindrome {
    /*

    Example 1: Valid Palindrome (Mixed case, punctuation, spaces)
        "s": "A man, a plan, a canal: Panama"
        Expected: true
        Explanation: "amanaplanacanalpanama" is a palindrome.

    Example 2: Invalid Palindrome
        "s": "race a car"
        Expected: false
        Explanation: "raceacar" is not a palindrome.

    Example 3: Empty string after removing non-alphanumeric characters
        "s": " "
        Expected: true

    */

    /*
    
    Example 1: Valid Positive Palindrome
        "s": "121"
        Expected: true

    Example 2: Negative Number (Minus sign breaks symmetry)
        "s": "-121"
        Expected: false

    Example 3: Trailing Zero
        "s": "10"
        Expected: false

    */
    public static void main(String[] args) {
        String str1 = "A! man, a plan, a canal: Panam!a";
        String str2 = "race, a !car";
        String str3 = " ";

        String str4 = "121";
        String str5 = "-121";
        String str6 = "10";
        checkPallindrome(str1);
        checkPallindrome(str2);
        checkPallindrome(str3);
        checkPallindrome(str4);
        checkPallindrome(str5);
        checkPallindrome(str6);
    }
    
    public static void checkPallindrome(String str){

        if (str == null || str.isEmpty()) {
            System.out.println("Invalid input");
            return;
        }

        int left = 0;
        int right = str.length()-1;
        boolean isPalindrome = true;

        while(left<right){
            char leftChar = str.charAt(left);
            char rightChar = str.charAt(right);

            if(!(Character.isLetterOrDigit(leftChar))){
                left++;
            } else if(!(Character.isLetterOrDigit(rightChar))){
                right--;
            } else {
                if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)){
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }
        }
        if(isPalindrome){
            System.out.println("The given Value "+str+" is pallindrome");
        } else {
            System.out.println("The given Value "+str+" is not pallindrome");
        }
    }
}