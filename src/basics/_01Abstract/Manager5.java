package basics._01Abstract;

/**
 * 
 * @author praveenrao how to use non-static member of ABSTRACT CLASS -make a
 *         subclass to abstract class. -make subclass as concrete class by
 *         implementing all abstract methods of abstract class. -finally create
 *         an object to subclass and start accessing members of abstract class
 *         through reference variable of concrete class i.e. sub class.
 */

abstract class E {
	abstract void test1();

	void test2() {
		System.out.println("test2");
	}
}

class F extends E {

	@Override
	void test1() {
		System.out.println("test1");
	}
	
}

public class Manager5 {
	public static void main(String[] args) {
		F f1 = new F();
		f1.test1();
		f1.test2();
	}
}
