/**
 * 
 */

/**
 * @author Student
 *
 */
import java.util.Random;
import java.util.Scanner;

public class test {
	public static void main(String[]args) {
		
	Random randomnumbers = new Random();
	int num;
	int num2;
	
	randomnumbers = new Random();
	num = randomnumbers.nextInt(100) + 1; //generates a random num 1-15
	
	System.out.println("Enter a number between 1 and 100 for today's lottery.");
	Scanner input = new Scanner(System.in);
	num2 = input.nextInt();
	
	System.out.println("Today's lottery numbers are...");
	System.out.println(num);
	System.out.println(" ");
	
	if(num==num2)
		System.out.println("You're a lucky winner!");
	else
		System.out.println("Sorry, try playing tomorrow.");
		
		
		
	}
	}

