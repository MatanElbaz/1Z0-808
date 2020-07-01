package Tests;

public class Question71 extends RuntimeException {

	public static void main(String[] args) {
		try {
			method();
		} catch (Question71 e) {
			System.out.println("A");
		}

	}

	public static void method() {
		try {
			throw Math.random() > 0.5 ?new Question71() : new RuntimeException();
		} catch (RuntimeException e) {
			System.out.println("B");
		}
		
	}
//Correct Answer: B
}
