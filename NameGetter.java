import java.util.Scanner;


public class NameGetter {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name or we fighting.");
		
		String name = input.nextLine();
		
		System.out.println("Aiight, " + name + " , now give me that full government. FIRST and LAST name");
		
		String government = input.nextLine();
		
		System.out.println("Is " + government + " really your full name? No middle name? I want your entire government. Run it.");
		
		String governmenta = input.nextLine();
		
		System.out.println("Okay, " + governmenta + ", now run me your social security number.");
		
		int ssn = input.nextInt();
	}

}
