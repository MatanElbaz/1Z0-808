package Tests;

interface Readable {
	public void readBook();

	public void setBookMark();
}

abstract class Book implements Readable {
	public void readBook() {
	}

}

// The type Ebook must implement the inherited abstract method
// Readable.setBookMark()
class Ebook extends Book {
	public void readBook() {

	}

	@Override
	public void setBookMark() {
		// TODO Auto-generated method stub
		
	}

	

}