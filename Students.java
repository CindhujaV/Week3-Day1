package week3day1;

public class Students {

	
	public void getStudeninfo(int id)
	{
		System.out.println("Passing Integer ID = " +id);
	}
	
	public void getStudeninfo(int id, String name)
	{
		System.out.println("Passing Integer ID = "  +id);
		System.out.println("Passing Integer ID = "  +name);
	}
	
	public void getStudeninfo(String email, int ph)
	{
		System.out.println("Email = "+email);
		System.out.println("Phone = "+ph);
	}
	public static void main(String[] args) {
		Students Stu = new Students();
		Stu.getStudeninfo(5);
		Stu.getStudeninfo(5,"ABCD");
		Stu.getStudeninfo("ABCD@gmail.com",5);

	}

}
