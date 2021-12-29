package basics.iib;

/**
 * 
 * @author praveenrao
 *
 */
public class C {

	{
		System.out.println("IIB1");
	}

	C(int i) {
		System.out.println("C constructor para");
	}

	{
		System.out.println("IIB2");
	}
	
	public static void main(String[] args) {
		C c1 = new C(11);
		System.out.println("------------");
		C c2 = new C(111);
		System.out.println("------------");
		C c3 = new C(22);
		System.out.println("------------");
	}

}
