package basics._01Abstract;

/**
 * 
 * @author praveenrao
 *
 */

abstract class A {
	abstract void test1(); // abstract method

	void test2() { //concrete method
		System.out.println("test2");
	}

	abstract void test3();

}

public class Manager1 {
	public static void main(String[] args) {
		A a1 = new A();
	}
	/**
	 * -if any method is unimplemented then declare that method as abstract.
	 * -method either have implementation  or abstract. abstract method does not have definition block.
	 * -test1 and test3 are declared but not defined.
	 */
}
