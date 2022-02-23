
public class Main {

	public static void main(String[] args) {
		// array = used to store multiple values in a single variable
		
		String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};
		
		cars[0] = "Mustang";
		
		System.out.println(cars[3]);
		
		String[] phones = new String[3];
		
		phones[0] = "Iphone";
		phones[1] = "Samsung";
		phones[2] = "Pixel";
		
		for (int i = 0; i < cars.length; i++) {
			
			System.out.println(cars[i]);
		}
 	
		
		for (int i = 0; i < phones.length; i++) {
			
			System.out.println(phones[i]);
		}
 	

	}

}