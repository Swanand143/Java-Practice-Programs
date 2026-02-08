import java.util.*;
class ScannerClass3
{
	public static void main(String[] args)
	  {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string 2:");
		String str2 = sc.next(); 
		System.out.println(str2);
		sc.nextLine(); // Imp line When  word is Skip and go to next string operation
		System.out.print("Enter a string 1:");
		String str1 = sc.nextLine(); 
		System.out.println(str1);  
	  }

}