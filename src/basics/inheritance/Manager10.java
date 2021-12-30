package basics.inheritance;

/**
 * 
 * @author praveenrao
 *
 */

class U {
	U(int i) {
		System.out.println("U(int)");
	}
}

class V extends U {

	V(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

}

public class Manager10 {
	public static void main(String[] args) {
		V v1 = new V(); //constructor is undefined
	}
}
