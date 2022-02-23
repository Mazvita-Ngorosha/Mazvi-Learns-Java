import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//if statements perform a block of code if its  condition evaluates to be true
		//comparison operators > < =
		
		@SuppressWarnings("resource")
		Scanner years = new Scanner(System.in);
		
		System.out.println("Please enter your age: ");
		
		
		int age = years.nextInt();
		
		if (age >=18) {
			
			System.out.println("You are an adult!");
		}
		else if (age>=65) {
			System.out.println("Your are a senior citizen!");
		}
		else if (age>=13) {
			System.out.println("You are a teenager!");
		}
		else {
			System.out.println("You are a minor!");
		}
		

	}
}