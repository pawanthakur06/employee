package employeedetails;


	import java.util.Scanner;

	public class Main {
	    public static Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {

	        Employee employee = new Employee();

	        System.out.println("please enter your full name:");
	        String fullName = sc.next();
	        employee.setFullName(fullName);
	        System.out.println("employee=" + employee.toString());

	        System.out.println("Enter your designation:");
	    }
	}


