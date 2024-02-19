package university;

public class Student extends Members {
private static int count = 0;
public int ID;
	public Student(String name, int age, String email) {
		super(name, age, email);
		// TODO Auto-generated constructor stub
		Student.count++;
		this.ID = Student.count;
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub

	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub

	}
	
	public void learn() {
	}

}
