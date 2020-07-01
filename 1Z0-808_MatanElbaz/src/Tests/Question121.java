package Tests;

 class  Student {
	private int age = 0;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class Question121 {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		s1.setAge(1);	
		s2.setAge(2);
		s3.setAge(3);
		s1 = s2;
		s3 = s2;
		System.out.println(s2.getAge());
		s2 = null;
		System.out.println(s1.getAge());
		System.out.println(s3.getAge());
		System.out.println(s2.getAge());
		//Correct Answer: C
	}

}
