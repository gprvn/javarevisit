package basics.iib;
/**
 * 
 * @author praveenrao
 *
 */
public class A {

	A(){
		System.out.println("A construtor called");
	}
	
	{
		System.out.println("IIB");
	}
	
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println("-----------");
		A a2 = new A();
		System.out.println("-----------");
		A a3 = new A();
		System.out.println("-----------");
	}
	
}
