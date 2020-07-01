package Tests;

public class Question80 {

	public static void main(String[] args) {
		try {
int num = 10;
int div = 0;
int ans = num/div;
		} catch (ArithmeticException ae) {
			ans = 0;                                     //line n1
		}catch (Exception e) {
			System.out.println("Invalid calculation");
		}
		System.out.println("Answer = "+ ans); //line n2

	}
//Correct Answer: E
}
