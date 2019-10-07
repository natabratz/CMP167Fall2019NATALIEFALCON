import java.util.Scanner;

public class methodClass {

//FIRST METHOD = FIND THE SUM OF THREE NUMBERS
	public static int numProducts(int a, int b, int c) {
		return a*b*c;
		}

//SECOND METHOD = FIND THE SUM OF CONSECUTIVE NUMBERS BETWEEN TWO GIVEN INTEGERS
	public static int sumTwo(int a, int b) {
		int sum = 0;

		if(a < b) {
			for(int i = 0; i < b; ++i) {
				sum += i;	
			} //END OF FOR LOOP
		}// END OF IF STATEMENT

		if(b < a) {
			for(int i = 0; i < a; ++i) {
				sum += i;
			}
		}
		
		//RETURNS SUM OF CONSECUTIVE NUMBERS
		return sum;
	}

//THIRD METHOD = 
	public static double averageNum(int a) {
		double sum = 0.0;
		
		for(int i = 1; i <= a; ++i) {
			sum+=i;
		}
		double avg = sum/a;
		return avg;
	}

public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);

	//ASKS USER FOR INPUT
	System.out.println("Please enter three integers.");

	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();

	//TESTS FIRST METHOD
	int firstMethod;

	firstMethod = numProducts(a, b, c);
	System.out.println("The product of your integers are: " + firstMethod);

	//TESTS SECOND METHOD
	System.out.println("\nPlease enter two more integers.");

	int n = scan.nextInt();
	int m = scan.nextInt();

	int secondMethod;

	secondMethod = sumTwo(n, m);
	System.out.println("The sum of the consecutive numbers between your integers are: " + secondMethod);
	
	//TEST THIRD METHOD
	System.out.println("\nNow enter one more integer: ");
	int num = scan.nextInt();
	
	double avgNum = averageNum(num);
	System.out.println("The average between 1 and " + num + " is " + avgNum);


	}

}