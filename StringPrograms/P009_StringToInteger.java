package StringPrograms;

public class P009_StringToInteger {
    public static void main(String[] args) {
        System.out.println(stringToIntegerOne("1254"));
    }

    public static int stringToIntegerOne(String str){
        try{
            int result = Integer.parseInt(str);
            return result;
        } catch (Exception e){
            System.out.println("Invalid Number Format "+e.getMessage());
        }
        return 0;
    }
}
