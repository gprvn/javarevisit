package basics.constructor;

//0
public class A {

	A(){
		System.out.println("constructor is called");
	}
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println("------");
		A a2 = new A();
		System.out.println("------");
		A a3 = new A();
		System.out.println("------");
	}
	
}
