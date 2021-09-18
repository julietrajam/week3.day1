package week3.day1.string;

public class FindIndexOfString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text="Java Exercise";
		char ch;
		
		
		for(int i=0;i<text.length();i++)
		{
			ch=text.charAt(i);
			if(ch=='e')
			{
				System.out.println("Index of e: "+i);
			}
			else
			if(ch=='s')
			{
				System.out.println("Index of s: "+i);
			}
			else
				continue;
			
		}
			
				

	}

}
