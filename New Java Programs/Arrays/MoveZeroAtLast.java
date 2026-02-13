package Arrays;

import java.util.Arrays;

public class MoveZeroAtLast {

    public static void main(String[] args) {
        
        int [] arr = {5,0,2,0,4,1,0};
        System.out.println(Arrays.toString(zero(arr)));


    }
    public static int[] zero(int[] arr){
        
        for(int i = 0,j=0;i<arr.length; i++){
            if (arr[i]!=0) {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;

    }
    
}