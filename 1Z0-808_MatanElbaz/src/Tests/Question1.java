package Tests;

class Product {
	double price;
}

public class Question1 {
	public void name(Product product, double price) {
		price = price * 2;
		product.price = product.price + price;
	}

	public static void main(String[] args) {
		Product product = new Product();
		product.price = 200;
		double newPrt = 100;
		Question1 question1 = new Question1();
		question1.name(product, newPrt);
		System.out.println(product.price +" : " + newPrt);
	}

}
