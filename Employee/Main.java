package Employee;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Aravinth", 500000);
		Employee e2 = new Employee(102, "Dinesh", 450000);
		Employee e3 = new Employee(103, "vijay", 450000);
		ArrayList<Employee> a = new ArrayList<Employee>();
		a.add(e1);
		a.add(e2);
		a.add(e3);
		System.out.println("Employee Detatils");
		for (Employee e : a) {
			e.displayDetails();
		}
	}
}
