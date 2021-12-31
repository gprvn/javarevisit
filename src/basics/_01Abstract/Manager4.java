package basics._01Abstract;

/**
 * 
 * @author praveenrao
 *
 */

abstract class D {
	static int i = 10;
	int j = 20;
}

public class Manager4 {
	public static void main(String[] args) {
		D d1 = new D(); //CTE
		System.out.println(d1.j);
		System.out.println(D.i);
	}
	
	/**
	 * inorder to restrict usage of non-static members
	 * we declare that class as abstract boz those can't 
	 * be instantiated.
	 */
}
