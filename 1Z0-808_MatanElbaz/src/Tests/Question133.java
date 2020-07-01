package Tests;

abstract class A3{
	private static int i;
	public void doStuff() {}
	public A3() {
		// TODO Auto-generated constructor stub
	}
	
}

final class A1{
	public A1 () {}
}
public class Question133{
	private static int i;
	private Question133() {}
}
class A4{
	protected static final int i ;
	private void doStuff() {}
}

final abstract class A5{
	protected static int i ;
	void doStuff() {};
	abstract void doIt();
}//Correct Answer: DE
