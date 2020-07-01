package Tests;

import java.io.IOException;

class X2 {
	public void printFileContent() throws IOException {
		System.out.println("jajaj");
		throw new IOException();
	}
}

public class Question8 {
	public static void main(String[] args) {
		X2 xObj = new X2();
		try {
			xObj.printFileContent();
		} catch (Exception e) {
			System.out.println("work!");
		}//Correct Answer:
		//B) Replace line 13 with;
//	    try {
//	        xobj.printFileContent();
//	    }
//	    catch(Exception e){ } - they put also IOException on the catch block by mistake..
		
//	C) Replace line 5 with public void printFileContent() throws IOException{
	}

}
