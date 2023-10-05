import java.util.Scanner;
//WAJP find the smallest digit in a number;
public class SmallestDigitInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smallestDigit();

	}

	 static void smallestDigit() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter your Number = ");
		 int n= scan.nextInt();
		 int s = n%10;
//		 int r;
		 while(n>0) {
			  int r =n%10;
			 if(r<s) {
				 s=r;
			 }
			 n=n/10;
		 }System.out.println("The samllest digit in number = "+s);
		 scan.close();
	}

}
