package Tests;

class A{
	public void test() {
		System.out.println("A");
	}
}

class D extends A{
	public void test() {
		System.out.println("B");
	}
}

public class Question95 extends A {
	public void test() {
		System.out.println("C");
	}

	public static void main(String[] args) {
		A b1 = new A();
		A b2 = new Question95();
		
		b1 = (A) b2;
		A b3 = (D) b2; //Tests.Question95 cannot be cast to Tests.D
		b1.test();
		b3.test();
	}
	//Correct Answer: E

	
}
