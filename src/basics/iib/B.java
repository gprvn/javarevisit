package basics.iib;

/**
 * 
 * @author praveenrao
 *
 */
public class B {
	
	B(){
		System.out.println("B");
	}
	public static void main(String[] args) {
		B b1 = new B();
		System.out.println("---------");
		B b2 = new B();
		System.out.println("---------");
		B b3 = new B();
		System.out.println("---------");
	}
	{
		System.out.println("IIB1");
	}
	{
		System.out.println("IIB2");
	}
	{
		System.out.println("IIB3");
	}
}
