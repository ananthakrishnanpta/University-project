package university;

public abstract class Staff extends Members {

	private int salary;

	public Staff(String name, int age, String email, int salary) {
		super(name, age, email);
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}

	
	public abstract void login();
	public abstract void logout();
	
	public int showSalary() {
//		System.out.println("Given salary of :" + this.salary);
		return this.salary;
	}

}
