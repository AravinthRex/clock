package Employee;

public class Employee {
	int id;
	String name;
	Double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void displayDetails() {
		System.out.println("id=" + id + ", name=" + name + ", salary=" + salary);
	}
}
