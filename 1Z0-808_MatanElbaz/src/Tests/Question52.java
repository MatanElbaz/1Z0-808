package Tests;

public class Question52 {

	public static void main(String[] args) {
		String[] strs = new String[2];
		int idx = 0 ;
		for (String s : strs) {
			
			strs[idx].concat("element "+idx);
			idx++;
		}
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[idx]);
		}

	}

}
//Correct Answer: D

