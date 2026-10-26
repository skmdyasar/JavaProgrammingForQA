package QAPractice;

public class AccentureInterview2 {
    public static void main(String[] args) {
        String str = "Java,Selenium,TestNG";

        String result1 = str.replaceAll(","," ");
        System.out.println(result1);

        String result2[] = str.split(",");
        for(String result : result2){
            System.out.print(result+" ");
        }
    }
}
