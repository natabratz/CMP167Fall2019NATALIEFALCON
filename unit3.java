import java.io.StringWriter;
import java.io.PrintWriter;

import java.util.Scanner;

public class unit3 {
	public static void main (String[]args) {
		
		//creates a StringWriter from the io package
		StringWriter sw = new StringWriter();
		
		//creates a PrintWriter from the io package, prints 
		//whatever the stringwriter creates
		PrintWriter pw = new PrintWriter(sw);
		
		//printwriter prints what's in the parentheses
		pw.print("Celine Dion");
		
		System.out.println(" ");
		//creates a variable that assigns the sw value in it
		String name1 = sw.toString();
		
		System.out.println(name1);
		
		//print f command:%(flag)(width).(precision)specifier
		System.out.printf("Her name was %15s", name1);
		
		System.out.println(" ");
		
		//new test
		
		String myWords = "Hello Sara 23";
		Scanner inStream = new Scanner(myWords);
		
		String greeting = inStream.next();
		String name2 = inStream.next();
		int age = inStream.nextInt();
		
		System.out.println("The age of " + name2 + " is " + age);
		System.out.printf("The age of %s is %d", name2, age);
		
	}
}
