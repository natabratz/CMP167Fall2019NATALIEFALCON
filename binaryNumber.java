import java.util.Scanner;

public class binaryNumber {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("The binary number given is: 01011010");
		System.out.println("Enter 1 to see this converted into a decimal number: ");
		
		int proceed = scan.nextInt();
		//PROCEED
		if(proceed == 1)
		{
		System.out.println("\n01011010 in decimal form is: 90.0");
		}
		
		else {System.out.println("You did not enter 1. Please restart the program.");}
		
	}
}
