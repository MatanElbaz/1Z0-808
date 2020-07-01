package Tests;

public class Question101 {
	String name;
	int age = 25;

	public Question101(String name) {
		this(); //line n1 The constructor Question101() is undefined
		setName(name);
	}

	public Question101(String name, int age) {
		Question101(name);// line n2 The method Question101(String) is undefined for the type Question101
		setAge(age);
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String show() {
		return name+" "+age;
	}
	
	public static void main(String[] args) {
		Question101 p1 = new Question101("Jesse");
		Question101 p2 = new Question101("Walter",52);
		System.out.println(p1.show());
		System.out.println(p2.show());
		
	}
//Correct Answer: A
}
