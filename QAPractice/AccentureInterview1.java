package QAPractice;

public class AccentureInterview1 {
    public static void main(String[] args) {
        String str = "abc123def456";
        System.out.println("Before "+str);

        String result = new StringBuffer(str.substring(0, 3)).reverse()+str.substring(3, 6)+
                        new StringBuffer(str.substring(6, 9)).reverse()+str.substring(9, 12);

        System.out.println("After  "+result);
    }
}
