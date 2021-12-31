package basics._02Interface;

interface A {

}

abstract class B {

}

class C {

}

interface D {
	void test1();
	public abstract void test2();
}

class E implements D{

	@Override
	public void test1() {
		System.out.println("test1");
	}

	@Override
	public void test2() {
		System.out.println("test2");
	}
	
}

public class Manager1 {
	public static void main(String[] args) {
		E e1 = new E();
		e1.test1();
		e1.test2();
	}
}
