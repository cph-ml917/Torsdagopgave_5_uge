//----------Task 2: Scanner basics: calculate years to retirement----------//

/*
This task will require you to use the Scanner class to get some data from the user. You will then use one of the inputs in a simple calculation, that will tell the user how many years they have to work before they can retire.

2.a: create a Main class with a main method.

2.b: In the main method start by printing this message to the user: "Please type your name".

2.c: Create a Scanner object for reading from the command line (remember to import the Scanner class from the util library: import java.util.Scanner; )

Hint: Scanner scanner = new Scanner(System.in);

2.d: Declare a String variable name and assign to it whatever is returned from a call to scanner's nextLine() method.

peep solution: String input =  scanner.nextLine();

2.e: Print the name of the user in a greeting (i.e. "Hello <name>") followed by the message "Please type your age"

2.f: Declare another variable of type int called age and assign to it the value returned by the nextInt() method of the Scanner object (reuse the Scanner object created in 2.c).

2.g: Print the value the user writes (the age variable) i.e. like this: "You are <age> years old".

2.h: Declare a third variable of type int. To this variable, assign the calculated number of years until the user can retire. You may assume retirement starts at age 67. Print the result (i.e. like this: "You have <x> years until retirement").
*/

import java.util.Scanner;


//2.a
public class Main{
	public static void main(String[] args){
		
		int retirementAge = 67;
		
		//2.b
		System.out.println("Please type your name: ");

		//2.c
		Scanner scanner = new Scanner(System.in);

		//2.d
		String name = scanner.nextLine();

		//2.e
		System.out.println("Hello, " + name);
		System.out.println("Please type your age: ");

		//2.f
		int age = scanner.nextInt();

		//2.g
		System.out.println("You are " + age + " years old");
		
		//2.h
		int timeToRetire = retirementAge - age;
		System.out.println("You have " + timeToRetire + " years until retirement");

	}	
}