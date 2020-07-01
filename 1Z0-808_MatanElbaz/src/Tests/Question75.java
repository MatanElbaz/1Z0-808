package Tests;

public class Question75 {
	int id ;
	String name;
	public Question75(int id,String name) {
		this.id = id;
		this.name = name;
	}
	public static void main(String[] args) {
		Question75 p1 = new Question75(101, "Pen");
		Question75 p2 = new Question75(101, "Pen");
		Question75 p3 = p1;
		boolean ans1 = 	p1 == p2;
		boolean ans2 = p1.name.equals(p2.name);
		System.out.println(ans1 +" " + ans2);
	}

}

//Correct Answer: C
