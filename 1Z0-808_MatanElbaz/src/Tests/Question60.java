package Tests;

public class Question60 {

	public static void main(String[] args) {
		int[] intArr = {15,30,45,60,75};
		intArr[2] = intArr[4];
		intArr[4] = 90;
		
		
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + ", ");
		}

	}

}//Correct Answer: C
