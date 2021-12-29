package basics.iib_sib;

/**
 * 
 * @author praveenrao
 *
 */
public class K {

	{
		System.out.println("IIB-1");
	}
	
	K(){
		this(11.11);
		System.out.println("K");
	}
	
	{
		System.out.println("IIB-2");
	}

	K(double d) {
		System.out.println("K -- double");
	}
	public static void main(String[] args) {
		K k1 = new K();
		System.out.println("-----");
		
		K k2 = new K(22.22);
		System.out.println("-----");
	}
	
	/**
	 * OUTPUT::
	 * IIB-1
	 * IIB-2
	 * K-double
	 * K
	 * ------
	 * IIB-1
	 * IIB-2
	 * k-double
	 * ------
	 * 
	 * 
	 */
	
}
