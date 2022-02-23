import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// a while loop executes a block of code as long as it's condition remains true
		
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
		System.out.println("You must enter your name to continue.");
		
		while(name.isBlank()) {
			System.out.println("Please enter your name: ");
			name = scanner.nextLine();
			
		}
		
		System.out.println("Hello " +name);
		
	}

}