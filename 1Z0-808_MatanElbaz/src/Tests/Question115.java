package Tests;

public class Question115 {
	public int amount;

//	public Question115() {  A
//		amount = 100;
//	}
	public Question115() { //D
		this.amount = 100;
	}
	
	public static void main(String[] args) {
		Question115 acct = new Question115();
		System.out.println(acct.amount); //100
		acct.amount = 150; //E
		System.out.println(acct.amount);  //150
	}
	//Correct Answer: ADE
}
