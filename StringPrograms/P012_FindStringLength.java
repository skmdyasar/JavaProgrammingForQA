package StringPrograms;

public class P012_FindStringLength {
    public static void main(String[] args) {
        String str = "Yasar ";
        System.out.println(str.length());
        int count = 0;
        for(char ch : str.toCharArray()){
            count ++;
        }
        System.out.println("The String length is "+count);
    }
}
