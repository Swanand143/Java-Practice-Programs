import java.util.*;
class ScannerClass2
{
	public static void main(String[] args)
	  {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string 1:");
		String str1 = sc.nextLine(); //Ramesh Kumar [fetch the whole string]
		System.out.println(str1);  //OP- Ramesh Kumar
		System.out.print("Enter a string 2:");
		String str2 = sc.next(); //Hello Java [Fetch Only singal Word]
		System.out.println(str2); //Op- Hello
	  }

}