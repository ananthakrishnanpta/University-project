package university;

public class Faculty extends Staff {
	String course;
	static int population = 0;
	public Faculty(String name, int age, String email, int salary, String course) {
		super(name, age, email, salary);
		this.course = course;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("Hi, teacher!!! Please login using your credentials.");

	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		System.out.println("Hi teacher, Please logout!!!");
		
	}
	
	public void teach() {
		System.out.println("Hi, I'am teachin.");
	}

}
