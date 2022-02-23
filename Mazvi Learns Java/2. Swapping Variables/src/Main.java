
public class Main {

	public static void main(String[] args) {
		String x = "Water";
		String y = "Kool-Aid";
		
		System.out.println("Initial x: "+ x);
		System.out.println("Initial y: "+ y);
		
		String temp; //a place holder for variable x
		
		temp = x; 
		x=y;
		y=temp;
		
		System.out.println("New x: "+ x);
		System.out.println("New y: "+ y);
		

	}

}