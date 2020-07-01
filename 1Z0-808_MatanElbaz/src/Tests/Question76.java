package Tests;
class Employee{
	public int salary;
}
class Manager extends Employee{
	public int budget;
}

public class Question76 extends Manager {
	public int stockOptions;

	public static void main(String[] args) {
		Employee employee = new Employee();
		Manager manager = new Manager();
		Question76 director = new Question76();
		employee.buget = 200_000;
		manager.stockOptions = 500;
		//Correct Answer: CE


	}

}
