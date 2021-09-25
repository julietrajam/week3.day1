package week3.day1.methodoverloading;

public class Students {

	public void getStudentInfo(int id)
	{
		System.out.println("Student Id:"+id);
	}
	
	public void getStudentInfo(int id,String name)
	{
		System.out.println("Student Id: "+id);
		System.out.println("Student Name: "+name);
	}
	
	public void getStudentInfo(String email,long phno)
	{
		System.out.println("Student email: "+email);
		System.out.println("Student phone no: "+phno);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students s1=new Students();
		s1.getStudentInfo(235356);
		s1.getStudentInfo(2918, "Juliet");
		s1.getStudentInfo("julietrajam@gmail.com",89775674546587l );

	}

}
