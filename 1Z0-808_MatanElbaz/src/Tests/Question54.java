package Tests;

class MyString {
	String msg;

	MyString(String msg) {
		this.msg = msg;
	}
}

public class Question54 {

	public static void main(String[] args) {
		System.out.println("Hello " + new StringBuilder("Java se 8 "));
		System.out.println("Hello " + new MyString("Java se 8"));

	}

}//Correct Answer: C
