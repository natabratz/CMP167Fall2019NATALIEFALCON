import java.util.Scanner;

public class week5pt2 {
	public static void main(String[]args) {
		
		//creates scanner system
		Scanner scan = new Scanner(System.in);
		
		//asks for integers
		System.out.println("Hi! Please enter an integer: ");
		int a = scan.nextInt();

		System.out.println("Great, now please enter another integer: ");
		int b = scan.nextInt();

		System.out.println("Now, enter one last integer please. We'll call this integer \'n\': ");
		int n = scan.nextInt();

		//explains what the program will do
		System.out.printf("Interesting, you have entered %d and %d.\nWith these two numbers, we will: ", a, b);
		System.out.println("\n-Find the sum\n-Find all the squares from 1 to " + n + " \n-Figure out all the even numbers between 1 and 100");

		//program really begins
		System.out.println("\nEnter 1 to continue or 0 to exit: ");
		int proceed = scan.nextInt();

		//continue - finds sums, asks to continue to find all numbers
		if(proceed==1) {
			int c = a + b;
			System.out.println("The sum of your two numbers is " + c);
			System.out.println("To find out all the numbers between 1 and " + n + ", please enter 1. Otherwise, enter 0.");}
		int proceed2 = scan.nextInt();
		int allNums = 1;

		//numbers between 1 and n
		if(proceed2==1) {
			while(allNums <= n) {
				System.out.println(allNums);
				allNums++;
			}

			//enters all numbers from 1 to n
			System.out.println("Enter 1 to print all the squares from 1 to " + n + ".");
			int proceed3 = scan.nextInt();
			int squares = 1;
			int squared = 1;

			//squares between 1 and 10
			if(proceed3==1){
				while(squared < n) {
					System.out.println("The squares between 1 and " + n + " are: ");
					squared = squares * squares;
					System.out.println(squared);
					squares++;
				}

				System.out.println("Enter 1 to print all even numbers from 1 to 100: ");
				int proceedLast = scan.nextInt();
				int hunnit;

				//all numbers between 1 and 100
				if(proceedLast == 1) {

					for(hunnit = 0; hunnit <= 100; hunnit++) {
						hunnit = hunnit + 2;
					}

				//print even numbers from 100
				int even = 0;
				do {System.out.println(even);
					even += 2;}
				while(even <= 100);
					//					while() // Print even from numbers 1-100 using while loop

					//					do { // Print even numbers from 1-100 using do while loop
					//						
					//					}while()

				}

				else if(proceed2==0) {
					System.out.println("Exited.");
				}

				else {System.out.println("Error. Please restart program.");}

				if(proceed==0) {
					System.out.println("Exited.");}

				if(proceed != 0 && proceed != 1) {System.out.println("Error. Please restart the program.");}

			System.out.println("Thank you for running my program. Hope you enjoyed it! :)");

			}
		}
	}
}
