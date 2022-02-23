
public class Main {

	public static void main(String[] args) {
		//String = a reference data type that can be used to store one or more characters.
		//reference data types have access to useful methods.
		
		String name = "Mazvita";
		boolean nameResult = name.equalsIgnoreCase("Mazvita"); 
		//returns true or false if the name matches + the IgnoreCase allows the string to not match case and be accepted
		int lengthResult = name.length();
		//returns the length of String name
		char charResult = name.charAt(2);
		//returns the character at the index given
		int indexResult = name.indexOf("t");
		//returns the index of the character given
		boolean stringResult = name.isEmpty();
		//returns true or false to whether or not the string name is empty
		String upperResult = name.toUpperCase();
		//returns the UPPERCASE of the String name
		String lowerResult = name.toLowerCase();
		//returns the lower case of the String name
		String trimResult = name.trim();
		//returns the String name without any extra spaces
		String replaceResult = name.replace('M', 'W');
		//returns the new character replacing it with the old character.
		
		//to find more methods for strings, type the name of string. -> and will be able to find the other available methods
		
		String tryingNewMethod = name.repeat(3);
		//I found a new method amongst the many available when I typed name. -> I chose the repeat method which repeats the string.
		
		System.out.println(nameResult);
		System.out.println(lengthResult);
		System.out.println(charResult);
		System.out.println(indexResult);
		System.out.print(stringResult);
		System.out.println();
		System.out.print(upperResult);
		System.out.println();
		System.out.println(lowerResult);
		System.out.println(trimResult);
		System.out.println(replaceResult);
		System.out.println(tryingNewMethod);
		
	}

}
