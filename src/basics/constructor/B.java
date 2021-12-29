package basics.constructor;

public class B {
	B(int i){
		System.out.println("B: "+i);
	}
	public static void main(String[] args) {
		B b1 = new B(55);
		System.out.println("-------");
		B b2 = new B(90);
		System.out.println("-------");
	}
}
