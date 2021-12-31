package basics._01Abstract;
/**
 * 
 * @author praveenrao
 *
 */
abstract class C {
	abstract void test1();
	static void test2() {
		System.out.println("test2");
	}
}
public class Manager3 {
	public static void main(String[] args) {
		C.test2();
	}
	
	/**
	 * to use static members, we no need to create object of the class.
	 */
}
