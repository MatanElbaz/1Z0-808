package Tests;

class C2{
	public void displayC2() {
		System.out.println("C2");
	}
}
interface I{
	public void displayI() ;
}
public class Question119 extends C2 implements I{

	@Override
	public void displayI() {
		System.out.println("C1");
	}
	public static void main(String[] args) {
		C2 obj1 = new Question119();
		I obj2 = new Question119();
		
		C2 s = obj2;
		I t = obj1;
		
		t.displayI();
		s.displayC2();
	}
	
	

}
//Current Answer: D - C2 and I are not parent/child class to each other. Implicit casting will not work.
//At least, we will need to explicitly cast
//C2 s = (C2) obj2;
//I t = (I) obj1;
