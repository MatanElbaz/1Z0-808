package Tests;

public class Question118 {
	public static int stvar = 100;
	public int var = 200;
	
	public String toString(){
	return var + ":"+ stvar;
	}

	public static void main(String[] args) {
		Question118 t1 = new Question118();
	t1.var = 300; // var=300 stvar100
	System.out.println( t1);
	Question118 t2 = new Question118();
	t2.stvar = 300;//var=200 stvar=300
	System.out.println( t2);
	//Output
	//300:100
	//200:300
	//Correct Answer: B
	}
}
