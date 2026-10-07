package StringPrograms;

public class P016_CountStringWords {
    public static void main(String[] args) {

        String str = " run the test suite ";
        System.out.println(countWords(str));
    }

    public static int countWords(String str){
        String str2[] = str.trim().split(" ");
        int totalWords = str2.length;
        return totalWords;
    }
}
