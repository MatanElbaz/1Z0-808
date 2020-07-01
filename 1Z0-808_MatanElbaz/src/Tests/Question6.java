package Tests;

import java.io.IOException;

class x{
	//add throws  IOException
	public void printFileContent()  {
		/*code goes here*/
		throw new IOException();
	}
}

public class Question6{
	//add throws  IOException
	public static void main(String[] args) {
		x xobj = new x();
		xobj.printFileContent();
	}
}
