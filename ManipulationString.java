package week3.day1.string;

public class ManipulationString {
	
	public static void main(String[] args) {
		
		/*
		 * Write a Java program to replace a specified character with another character
		 * and add # to the given string.
		 * 
		 * String sentence = "I am working with Java8" replace 8 to 11 Print the
		 * characters from 5 to 14
		 */
		
		
		String text = "I am working with Java8";
		String newText = text.replace("8", "11");
		newText.substring(5, 14);
		
		System.out.println("Replace a specified character with another character -"+newText);
		System.out.println("Print the characters from 5 to 14 -" +newText.substring(5, 14));
		
		
	}

}
