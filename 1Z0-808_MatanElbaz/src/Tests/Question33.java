package Tests;

public class Question33 {
	int ns;
	static int s;

	public Question33(int ns) {
		if (s < ns) {
			s = ns;
			this.ns = ns;
		}
	}

	void doPrint() {
		System.out.println("ns =" + ns + " s = " + s);
	}

	public static void main(String[] args) {

		Question33 ref1 = new Question33(50);
		Question33 ref2 = new Question33(125);
		Question33 ref3 = new Question33(100);
		ref1.doPrint();
		ref2.doPrint();
		ref3.doPrint();

		// Correct Answer: B
		// ns =50 s = 125
		// ns =125 s = 125
		// ns =0 s = 125
	}

}
