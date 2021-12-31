package basics._01Abstract;

/**
 * 
 * @author praveenrao
 *
 */

abstract class B {
	abstract void test1();

	abstract void test2();

	abstract void test3();

	void test4() {

	}

}

public class Manager2 {
	public static void main(String[] args) {
		B b1 = new B();
	}
}
