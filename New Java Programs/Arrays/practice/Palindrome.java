package Arrays.practice;

public class Palindrome {
    
    public static void main(String[] args) {
        
        String s = "madamkee";
        boolean bs = true;
        for(int i=0, j=s.length()-1;i<j ;i++,j--){
            if (s.charAt(i)!=s.charAt(j)) {
                bs = false;
                break;
            }
        }
        if (bs) {
            System.out.println("palindrome");
        }else{
             System.out.println("not palindrome");
        }

    }

}
