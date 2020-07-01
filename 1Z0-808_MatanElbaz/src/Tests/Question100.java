package Tests;

import java.awt.LinearGradientPaint;

import javax.sound.sampled.Line;

public class Question100 {
	int count;

	private static void displayMsg() {
		count++; //line n1         Cannot make a static reference to the non-static field count
		System.out.println("Welcome" +"Visit Count:" + count)); //line n2
	}

	public static void main(String[] args) {
		Question100.displayMsg();  // line n3
		Question100.displayMsg();  // line n4

	}

}
