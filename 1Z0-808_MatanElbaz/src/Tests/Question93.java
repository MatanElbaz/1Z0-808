package Tests;

class Employee {
	private String name;
	private int age;
	private int salary;

	public Employee(String name, int age) {
		setName(name);// they didnt put ";" in the end
		setAge(age);// here too
		setSalary(2000);
	}

	public Employee(String name, int age, int salary) {
		setSalary(2000);
		this(name, age);// Constructor call must be the first statement in a constructor
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void printDetails() {
		System.out.println(name + " :" + age + ": " + salary);
	}

}

public class Question93 {
	public static void main(String[] args) {
		Employee e1 = new Employee();// The constructor Employee() is undefined
		Employee e2 = new Employee("Jack", 50);
		Employee e3 = new Employee("Chloe", 40, 5000);
		e1.printDetails();
		e2.printDetails();
		e3.printDetails();
	}
	//Correct Answer: E

	
	
}
