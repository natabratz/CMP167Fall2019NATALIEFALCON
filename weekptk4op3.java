import java.util.Scanner;

public class weekptk4op3 {
public static void main(String[]args) {

	//write a program to calculate the sum of three numbers.
	System.out.println("Enter three integers.");
	
	Scanner input = new Scanner(System.in);
	int num1 = input.nextInt();
	int num2 = input.nextInt();
	int num3 = input.nextInt();
	int sum = num1 + num2 + num3;
	System.out.println("The sum of these integers are: " + sum);
	
	//write a program to calculate the product of four numbers.
	System.out.println("\n\nNow, for another test! Enter four integers.");
	int anum1 = input.nextInt();
	int anum2 = input.nextInt();
	int anum3 = input.nextInt();
	int anum4 = input.nextInt();
	int product = anum1*anum2*anum3*anum4;
	System.out.println("The product of these integers are: " + product);
	
	
	
}
}

