package Tests;

public class Question50 {

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = new String("java");
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}

	}

}
//Correct Answer: B
