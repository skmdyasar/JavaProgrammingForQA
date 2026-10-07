package StringPrograms;

public class P003_CountVowelsConsonants {
    public static void main(String[] args) {
        String str = "India is playing Test Match";
        str = str.toLowerCase();
        String vowels = "";
        String consonants = "";
        int vowelsCount = 0;
        int consonantsCount = 0;

        for(char ch : str.toCharArray()){            
            if(ch>='a' && ch<='z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels+=ch;
                    vowelsCount++;
                } else {
                    consonants+=ch;
                    consonantsCount++;
                }
            }
        }

        System.out.println("The Vovels are "+vowels);
        System.out.println("The Vowels count is "+vowelsCount);
        System.out.println("The Consonants are "+consonants);
        System.out.println("The Consonants count is "+consonantsCount);
    }
}
