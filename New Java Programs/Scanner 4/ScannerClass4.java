import java.util.*;
class ScannerClass4
  {
	public static void main(String[] args)
	  {
		Scanner ab = new Scanner(System.in);
		System.out.print("Enter a character:");
		char ch1 = ab.next().charAt(0); //Java
		System.out.println(ch1); //Op- J

		System.out.print("Enter a character:");
		char ch2 = ab.next().charAt(2); //Java
		System.out.println(ch2); // OP- v

		System.out.print("Enter a character:");
		char ch3 = ab.next().charAt(5); //Java
		System.out.println(ch3); // OP- Runtime Exception error [StringIndexOutOfBoundsException]
	  }
  }