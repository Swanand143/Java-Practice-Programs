package Arrays.practice;

public class VowCon {

    public static void main(String[] args) {
        
        String s = "Interview";
        int vowels =0;
        int consonants =0;
        for(int i=0;i<s.length() ; i++){
            if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'|s.charAt(i)=='u'|s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'|s.charAt(i)=='U') {
                vowels++;
            }else{
                consonants++;
            }
        }
        System.err.println("Vowels = "+vowels);
        System.err.println("Consonants = "+consonants);
    }
    
}
