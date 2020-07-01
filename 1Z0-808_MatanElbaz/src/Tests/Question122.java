package Tests;

public class Question122 {

	public static void main(String[] args) {
		int wd = 0;
		String[] days= {"sun","mon","wed","sat"};//they put () except {}
		for (String s : days) {
			System.out.println(wd);
			switch (s) {
				case "sat":
					case "sun":
						wd -=1;// they put ' : '
							break;
							case "mon":
								wd++;
							case "wed":
								wd +=2;

			}
		}
		System.out.println(wd);
	}
//	Correct Answer: D 
//	BUT!!!!  if we want to ignore the compilation problems
//  so the output will be 3 - so A is probably the current answer. 
} 
