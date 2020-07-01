package Tests;

public class Question97 {

	public static void main(String[] args) {
		int numbers[] = { 12, 13, 42, 32, 15, 156, 23, 51, 12 };
		int max = findMax(numbers);
		System.out.println(max);
	}

	static int findMax(int[] numbers) {
		int max = 0;
		for (int i : numbers) {
			if (max < i) {
				max = i;
			}
		}
		return max;
	}// Correct Answer: C

}
