import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/* Logical operators are used to connect two or more expressions
		 * && = (AND) both conditions must be true
		 * || = (OR) either condition must be true
		 * ! = (NOT) reverses boolean value of condition
		 */
		
		// Checking the Temperature
		Scanner Temp = new Scanner (System.in);
		
		System.out.println("Please enter the temperature in Celcius: ");
		
		int temp = Temp.nextInt();
		
		if(temp > 30) {
			System.out.println("It is hot outside.");
			
		}
		else if(temp>=20 && temp<=30) {
			System.out.println("It is warm outside.");
		}
		else {
			System.out.println("It is cold outside.");
		}
		
		// To quit press q or Q
		Scanner game = new Scanner(System.in);
		
		System.out.println("You are playing a game! Press q or Q to quit.");
		String response = game.nextLine();
		
		if(response.equals("q") || response.equals("Q")) {
			System.out.println("You quit the game. The game has ended.");
		}
		else {
			System.out.println("You are still playing the game.");
		}
		
		
		// NOT 
		
		Scanner number = new Scanner(System.in);
		
		System.out.println("Guess a number between 1 and 10: ");
		
		int num = number.nextInt();
		
		if(num != 3 ) {
			System.out.println("Wrong Guess");
		}
		else {
			System.out.println("CORRECT GUESS!");
		}
			
		
	}

}