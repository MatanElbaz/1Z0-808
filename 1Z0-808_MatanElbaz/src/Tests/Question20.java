package Tests;

public class Question20 {

	public static void main(String[] args) {
		int x =5;
		while(isAvailable(x)) {
			System.out.println(x);
			x--; // B
		}

	}

	private static boolean isAvailable(int x) {
		return x-- > 0 ? true:false;
	}

}
