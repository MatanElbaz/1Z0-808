package Tests;

  class C {
	public C() {
		System.out.print("A ");
	}
}

class B extends C {
	public B() {
		System.out.print("B ");
	}
}
class Question27 extends B{
	public Question27() {
		System.out.print("C ");
	}
	public static void main(String[] args) {
		Question27 question27 =new Question27();
	}
}
