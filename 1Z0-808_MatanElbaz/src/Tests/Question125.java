package Tests;

interface Downloadable {
	public void download();
}

interface readable extends Downloadable {
	public void readBook();
}

abstract class Book implements readable {
	public void readBook() {
		System.out.println("Read Book");
	}
}

class Ebook extends Book {
	public void readBook() {
		System.out.println("Read E-Book");
	}

}

public class Question125 {
	public static void main(String[] args) {
		Book book1 = new Ebook();
		book1.readBook();
	}// Correct Answer: C
}
