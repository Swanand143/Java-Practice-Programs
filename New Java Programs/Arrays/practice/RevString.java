package Arrays.practice;

public class RevString{
    
    public static void main(String[] args) {
        
        String s = "java";
        String ans = "";
        for(int i=s.length()-1;i>=0 ; i--){
            ans+=s.charAt(i);
        }
        System.out.println(ans);
    }

}