package week3.day1.string;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string1="I am Learning Java" ;
		String string2="I am learning java" ;
		
		if(string1==string2)
		{
			System.out.println("Both strings are same");
		}
		
		if(string1.equals(string2))
		{
			System.out.println("String1: "+string1+ "String2: "+string2+" are same");
		}
		
		if(string1.equalsIgnoreCase(string2))
		{
			System.out.println("String1: "+string1 + " and String2: "+string2+" are same");
		}
		
	}

}
