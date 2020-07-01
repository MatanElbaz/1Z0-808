package Tests;

import java.util.ArrayList;

public class Question45 {

	public static void main(String[] args) {
		ArrayList myList = new ArrayList<>();
		String[] myArray;
		try {
			while(true) {
				myList.add("My String");
			}
		} catch (RuntimeException re) {
			System.out.println("Caught an RuntimeException");
		}catch (Exception e) {
			System.out.println("Caught an Exception");
		}
		System.out.println("Ready to use");
	}

}
//Wait a few seconds for the program to run and you will receive java.lang.OutOfMemoryError
//Correct Answer: C
