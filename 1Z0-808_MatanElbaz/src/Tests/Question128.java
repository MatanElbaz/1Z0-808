package Tests;

 abstract class Question128 {
	 int price;
	 public static void insertToy() {
		System.out.println("hh");
	}
	 public int calculatePrice() {
		return price;
	}
	 public abstract int computeDiscount() ;
	//	Correct Answer: ADE. C is wrong because you must 
	// provide a method body since it’s not an abstract method
}
