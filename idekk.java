import java.util.Scanner;

public class idekk {
	public static void main(String[]args) {
		
		//PROJECT ONE
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What's your name?");
		String userName = scan.nextLine();
		
		System.out.printf("\nHey there %s, what's your favorite pet's name?\n", userName);
		
		String petName = scan.nextLine();
		int pLength = petName.length();
		
		System.out.printf("%nOh wow %s, did you know that your pet,%s, has %d characters in their name?", userName, petName, pLength);
		
		//PROJECT TWO
		System.out.println("\n\nEnter an integer: ");
		int n = scan.nextInt();
		int n2 = n - 1;
		int product = n;
		
		for(int i = n; i > 1; --i) {
			product *= n2;
			n2--;
			
		}
		
		System.out.println("The factorial of " + n + " is: " + product);
		//the product for n of 5 should be 120
		
		//PROJECT THREE
		System.out.println("\n\nEnter an integer: ");
		int userNumber = scan.nextInt();
		int rounds = userNumber%2;
		int rounds2 = userNumber/2;
		int sum = 0;
		int mark = 0;
		
			if(rounds == 0) {
				for(int o = 0; o < rounds2; ++o) {
					mark+=2;
					sum = sum + mark;
				}
			System.out.println("The sum of all even numbers from 1 to " + userNumber + "is: " + sum);
			}
			
			else if(rounds == 1) {
				for(int i = 0; i < (rounds2); ++i) {
					mark+=2;
					sum = sum + mark;
				}
			System.out.println("The sum of all even numbers from 1 to " + userNumber + "is: " + sum);
			}
	}
}
