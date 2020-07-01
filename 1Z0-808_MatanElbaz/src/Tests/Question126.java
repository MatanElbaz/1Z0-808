package Tests;

public class Question126 {
	private double length;
	private double height;
	private double area;
	
	public void setLength(double length) {
		this.length = length;
		setArea();
	}
	
	public void setHeight(double height) {
		this.height = height;
		setArea();
	}
	
	public void setArea() {
		area = length * height;
	}
	@Override
	public String toString() {
		return "("+area+")";
	}
	
	public static void main(String[] args) {
		Question126 Question126 = new Question126();
		Question126.setHeight(10);
		Question126.setLength(20);
		System.out.println(Question126);
	}//Correct Answer: AC
}
