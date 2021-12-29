package basics.this_key;

/**
 * 0
 * 
 * @author praveenrao ################################## # THIS Keyword #
 *         ##################################
 * 
 *         -- In order to use more than one constructor while creating an object
 *         for initialising non-static member in same class.
 * 
 */
public class B {
	int i;

	B() {
		this(10);
		System.out.println("B");
	}

	B(int m) {
		System.out.println("B(int)");
		i = m;
	}

	public static void main(String[] args) {
		B b1 = new B();
		System.out.println("------------");
		B b2 = new B();
		System.out.println("------------");
		System.out.println(b1.i + ":::" + b2.i);
	}

}
