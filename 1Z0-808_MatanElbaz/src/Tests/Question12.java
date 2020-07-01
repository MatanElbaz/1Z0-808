package Tests;

public class Question12 {
	public static void main(String[] args) {
		String ta = "A ";//A
		ta = ta.concat("B ");//A B
		String tb = "C ";
		ta = ta.concat(tb);//A B C
		ta.replace('C', 'D');//return new string
		ta = ta.concat(tb);//A B C C
		System.out.println(ta);
	}

}
