package Test.Test9.Testclass;


class A {
	private String a;
	public String b;
	protected String c;
	
	private static String d;
	public static String e;
	protected static String f;
	
	private void g() {
		System.out.println("g");
	}
	public void h(){
		System.out.println("h");
	}
	protected void i(){
		System.out.println("i");
	}
}

class B extends A {
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();

	}

}
