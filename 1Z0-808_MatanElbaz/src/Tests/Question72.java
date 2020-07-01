package Tests;

public class Question72 {
		String myStr = "7007";
	public void doStuff(String str) {
		int myNum = 0;
		try {
			String myStr = str;
			myNum = Integer.parseInt(myStr);
		} catch (NumberFormatException e) {
			System.out.println("Error");
		}
		System.out.println("myStr = " + myStr + ", myNum = " + myNum);
		
		
	}
	public static void main(String[] args) {
		Question72 obj = new Question72();
		obj.doStuff("9009");

	}

	//Correct Answer: C

}
