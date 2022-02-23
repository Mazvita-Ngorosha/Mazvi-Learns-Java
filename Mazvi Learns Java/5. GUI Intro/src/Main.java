import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		/* A GUI is a graphical user interface; a visual program
		that we can see and interact with.*/
		
		String name = JOptionPane.showInputDialog("Please Enter Your Name: ");
		JOptionPane.showMessageDialog(null, "Hello" + " " + name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Please Enter Your Age: "));
		JOptionPane.showMessageDialog(null, "You are " + age + " years old.");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Please Enter Your Height(cm): "));
		JOptionPane.showMessageDialog(null, "You are " + height +"cm tall.");
		
		double inFt = height / 30.48;
		
		JOptionPane.showMessageDialog(null, "Your height " + height + "cm translates to " + String.format("%.2f", inFt) +" feet tall.");
		//System.out.println(inFt);
		
		//Mazvita
		//22years old
		//154.94cm
		//5.08ft, used String to output only 2 decimal points of the height in ft.

	}

}