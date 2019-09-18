import java.util.Scanner;

public class unit4 {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		int age;
		
		System.out.println("Enter your age");
		age = scan.nextInt();
		
		//ifr the user is less than or equal to eighteen yrs old
		if (age<= 18)
		{
			System.out.println("What's up?");
		}
		
		else if (age >= 18 && age < 35)
		{
			System.out.println("wassgoooooood");
		}
		
		else {
			System.out.println("get off my line");
			
		}
	
		
		
	}

}
