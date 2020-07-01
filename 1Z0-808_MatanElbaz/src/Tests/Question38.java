package Tests;

public class Question38 {

	public static void main(String[] args) {
		double discount = 0;
		int qty = Integer.parseInt("81");// just for check to program we changed the param

		/////////
		if (qty >= 90) {
			discount = 0.5;
		}
		if (qty > 80 && qty < 90) {
			discount = 0.2;
		}
		// or
		discount = (qty >= 90) ? 0.5 : (qty > 80) ? 0.2 : 0;
		/////////

		System.out.println(discount);

	}//Correct Answer: AC

}
