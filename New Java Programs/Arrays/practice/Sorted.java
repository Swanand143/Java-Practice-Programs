package Arrays.practice;

public class Sorted {

    public static void main(String[] args) {
        
        int[] arr = {6,1,2,3,4};
        boolean ans = true;
        for(int i=0; i<arr.length-1; i++){
            if (!(arr[i]<arr[i+1])) {
                ans = false;
                break;
            }
        }
        if (ans) {
            System.out.println("Sorted");
        }else{
            System.out.println("Not sorted");
        }
    }
    
}
