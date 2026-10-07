package StringPrograms;

public class P007_ReverseWordOrder {
    public static void main(String[] args) {
        String str = "The Sky is in Blue Color";

        reverseByStringBuilder(str);
        reverseByTwoPointer(str);
    }

    public static void reverseByStringBuilder(String str){
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(int i=words.length-1; i>=0; i--){
            sb.append(words[i]);
            if(i>0){
                sb.append(" ");
            }
        }

        System.out.println(sb.toString());
    }

    public static void reverseByTwoPointer(String str){
        String[] words = str.split("\\s+");

        int left = 0;
        int right = words.length-1;

        while(left<right){
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;

            left++;
            right--;
        }

        for(String w : words){
            System.out.print(w+" ");
        }
    }
}
