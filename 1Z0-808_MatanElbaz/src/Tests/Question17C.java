package Tests;

public class Question17C {

	public static void main(String[] args) {
		Question17 acct = new Question17((int)Math.random()^1000); 
//		acct.amount=0;    C
//		acct.changeAmount(-acct.getAmount());     H
		acct.changeAmount(-acct.amount);       //    G
		System.out.println(acct.getAmount());
	}

}
