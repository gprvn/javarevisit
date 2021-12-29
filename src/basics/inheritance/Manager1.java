package basics.inheritance;

class A {
	int i;
}

class B extends A {
	int j;
}

public class Manager1 {
	
	public static void main(String[] args) {
		A a1 = new A();
		a1.i = 11;
		
		B b1 = new B();
		b1.i = 22;
		b1.j = 33;
		System.out.println(a1.i);
		System.out.println(b1.i);
		System.out.println(b1.j);
	}

}
