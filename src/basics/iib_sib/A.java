package basics.iib_sib;

/**
 * 
 * @author praveenrao
 *
 */
public class A {
	
	static {
		System.out.println("SIB");
	}
	{
		System.out.println("IIB");
	}
	public static void main(String[] args) {
		System.out.println("main begins");
		A a1 = new A();
		System.out.println("-----------");
		A a2 = new A();
		System.out.println("-----------");
		A a3 = new A();
	}
	
}
