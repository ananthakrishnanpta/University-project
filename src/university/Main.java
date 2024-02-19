package university;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to OOPs University !!!");
		// In university project,
		// We have two main entities:
		// 1. Members and Guests
//		1. Members:
//			a.Staff
//				a.1:Faculty
//				a.2:Non-teaching Staff
//			b.Student

//		2. Guests
//		Other possible entities:
//		3. Courses
		Faculty[] F = new Faculty[100]; // array of Faculty objects
		
		System.out.print("Press 0 for management console:\t");
		Scanner s1 = new Scanner(System.in);
		if(s1.nextInt() == 0) {
			menu1(F);	
		}
		
		
		
		
		
	}
	
	public static void menu1(Faculty[] F) {
//		clearScreen();
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.print("Please enter: \n 1. '0' for adding faculty\t:\t");
		int option1 = s.nextInt();
		System.out.println();
		if(option1 == 0) {
			F[Faculty.population++] = readFaculty();
		}
		else {
			System.out.println("Exit...");
			break;
		}
		}
		
	}

	public static Faculty readFaculty() {
//		String name, int age, String email, int salary, String course
		Scanner t = new Scanner(System.in);
		System.out.println("Name:");
		String name = t.nextLine();
		System.out.println("age:");
		int age = t.nextInt();
		System.out.println("email:");
		String email = t.next();
		System.out.println("salary:");
		int salary = t.nextInt();
		System.out.println("course:");
		String c = t.next();
		Faculty a = new Faculty(name,age,email,salary,c);
		return a;
	}
	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	}  

}
