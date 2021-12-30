package basics.inheritance;

/**
 * 
 * @author praveenrao
 *
 */

class S {
	S() {
		System.out.println("S()");
	}

	{
		System.out.println("IIB-S");
	}

	S(int i) {
		System.out.println("S-int");
	}
}

class T extends S {
	
	T(int i) {
		System.out.println("T-int");
	}
}

public class Manager9 {
	public static void main(String[] args) {
		T t1 = new T();
		System.out.println("done");
	}
	/**
	 * OUTPUT:
	 * IIB-S
	 * S()
	 * T()
	 */
}
