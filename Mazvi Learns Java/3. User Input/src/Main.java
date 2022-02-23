import java.util.Scanner; //include this for inputting data
public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);//include this for inputting data
		System.out.println("What is your name? ");
		String name = scanner.nextLine();
		System.out.println("How old are you? ");
		int age = scanner.nextInt();
		scanner.nextLine(); //clears out the scanner to fix the input issue with fav food.
		System.out.println("What is your favorite food?");
		String fav = scanner.nextLine();
		
		System.out.println("Hello " + name);
		System.out.println("You are " + age + " years old");
		System.out.println("Your favorite food is " + fav);

	}

}