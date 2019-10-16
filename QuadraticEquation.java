import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a value for \'a\': ");
		double a = scan.nextDouble();
		
		System.out.println("Enter a value for \'b\': ");
		double b = scan.nextDouble();
		
		System.out.println("Enter a value for \'c\': ");
		double c = scan.nextDouble();
		
		double x = 0;
		double x2 = 0;
		
		//MATH OPERATIONS
			//FIRST HALF OF EQUATIOn
			double bSquared = Math.pow(b,  2);
			double otherHalf = (4 * a * c);
			double sqRt = Math.sqrt((bSquared) - (otherHalf));
			
			double topHalf = ((-1 * b) - (sqRt));
			double topHalfPos = ((-1 * b) + (sqRt));
			
			//SECOND HALF OF EQUATION
			x = ((topHalf)/(2*a));
			x2 = ((topHalfPos)/(2*a));
			
			
		//RESULT
		System.out.println("The solutions to your quadratic equation are: " + x + " and " + x2);
			
		
	}
}
