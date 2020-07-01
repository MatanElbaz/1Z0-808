package Tests;

public class Question19 {
	
	void readCard(int cardNo) throws Exception{
		System.out.println("Reading Card");
	}

	void checkCard(int cardNo) throws RuntimeException{ //line n1
		System.out.println("Checking Card");
	}
	
	public static void main(String[] args) {
		Question19 ex = new Question19();
		int cardNo = 12344;
		ex.checkCard(cardNo); //line n2 =RuntimeException
		ex.readCard(cardNo);   //line n3 = we can't unhandily Exception
	}
}
