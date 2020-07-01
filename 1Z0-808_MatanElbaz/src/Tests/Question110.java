package Tests;

public class Question110 {

	public static void main(String[] args) {
		String str1 ="Java";
		String [] str2 = {"J","a","v","a"}	;
		String str3 = "";
		for (String str : str2) {
			str3 = str3+str;
		}

		boolean b1 = (str1 == str3);
		boolean b2 = (str1.equals(str3));
		System.out.println(b1 + " "+ b2);
	}//Correct Answer: B

	
}
