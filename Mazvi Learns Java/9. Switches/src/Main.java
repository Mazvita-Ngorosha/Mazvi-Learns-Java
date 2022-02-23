import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*switch statements are statements that allows a variable or other value to be 
		tested for equality against a list of values
		
		If code requires a lot of if statements, it might be best to opt for a switch statement instead.
		*/
		Scanner week = new Scanner(System.in);
		
		System.out.println("Please enter your favorite day of the week: ");
		String day = week.nextLine();
		
		switch(day) {
			case "Sunday": System.out.println("Yay it's Sunday!");
			break;
			case "Monday": System.out.println("Yay it's Monday!");
			break;
			case "Tueday": System.out.println("Yay it's Tuesday!");
			break;
			case "Wednesday": System.out.println("Yay it's Wednesday!");
			break;
			case "Thursday": System.out.println("Yay it's Thurday!");
			break;
			case "Friday": System.out.println("Yay it's  Friday!");
			break;
			case "Saturday": System.out.println("Yay it's Saturday!");
			break;
			default: System.out.println("That is not a day!");
		}
	}

}