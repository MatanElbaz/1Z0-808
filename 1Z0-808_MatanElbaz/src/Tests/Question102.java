package Tests;

public class Question102 {
	static int count = 0;
	int i = 0;
	
	public void changeCount() {
		while(i < 5) {
			i++;
			count++;
		}
	}
	
	public static void main(String[] args) {
		Question102 check1 = new Question102();
		Question102 check2 = new Question102();
		check1.changeCount();
		check2.changeCount();
		System.out.println(check1.count + ":"+ check2.count);
	}//Correct Answer: B
}
