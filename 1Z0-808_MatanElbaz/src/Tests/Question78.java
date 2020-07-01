package Tests;

public class Question78 {
	public static void main(String[] args) {
		int n[] [] = {{1,3},{2,4}};
		for (int i = n.length-1; i >=0; i--) {
			for (int y : n[i]) {
				System.err.print(y);
				
			}
		}
	}
}
//They wrong here
//Correct Answer: 2413
