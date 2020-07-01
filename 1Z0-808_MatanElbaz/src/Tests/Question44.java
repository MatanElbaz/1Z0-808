package Tests;

class Base{
	public void test() {
		System.out.println("Base ");
	}
}

class DeriverA extends Base{
	public void test() {
		System.out.println("DreiverA ");
	}
}
public class Question44 extends DeriverA {
	public void test() {
		System.out.println("DreiverB ");
	}
	public static void main(String[] args) {
		Base b1 = new Question44();
		Base b2 = new DeriverA();
		Base b3 = new Question44();
		b1 =(Base) b3;
		Base b4 = (DeriverA) b3;
		b1.test();
		b4.test();

	}

}
