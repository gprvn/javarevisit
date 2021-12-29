package basics.iib;

/**
 * 
 * @author praveenrao
 *
 */
public class D {

	{
		System.out.println("IIB1");
	}
	{
		System.out.println("IIB2");
	}

	D() {
		System.out.println("D constructor");
	}

	D(int i) {
		System.out.println("D constructor para");
	}
	
	public static void main(String[] args) {
		D d1 = new D();
		System.out.println("----------");
		D d2 = new D(12);
		System.out.println("----------");
	}

}
