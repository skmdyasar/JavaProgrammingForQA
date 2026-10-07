package StringPrograms;

public class P011_ReverseEachWord {
    public static void main(String[] args) {
        String str = "Hello World";
        reverseEachWord(str);
    }

    public static void reverseEachWord(String str){

        String words[] = str.split(" ");
        StringBuilder finalResult = new StringBuilder();

        for(String word : words){
            StringBuilder reverseWord = new StringBuilder(word);
            reverseWord.reverse();
            finalResult.append(reverseWord).append(" ");
        }
        System.out.println(finalResult.toString().trim());
    }
}
