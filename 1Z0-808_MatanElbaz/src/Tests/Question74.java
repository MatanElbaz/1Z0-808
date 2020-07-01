package Tests;

public class Question74 {

	public static void main(String[] args) {
		int nums1[] = new int[3];
		int nums2[] = {1,2,3,4,5};
		
		nums1 = nums2;
		for (int x : nums1) {
			System.out.print(x+ ":");
		}
	}

}//Correct Answer: A

