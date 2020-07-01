package Tests;

public class Question129 {
	int x, y;

	public Question129(int x, int y) {
		init(x, y);
	}

	public void init(int x, int y) {
		this.x = x*x;
		this.y = y*y;
		
	}
	
	public static void main(String[] args) {
		int x =3,y =5;
		Question129 obj = new Question129(x,y);
		System.out.println(x+" "+ y);
	}//Correct Answer: B
}
