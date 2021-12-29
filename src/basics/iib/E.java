package basics.iib;
/**
 * 
 * @author praveenrao
 *
 */
public class E {
	
	E(){
		System.out.println("E");
	}
	{
		System.out.println("IIB");
	}
	E(int i){
		System.out.println("E int");
	}
	E(double d)
	{
		System.out.println("E double ");
	}
	public static void main(String[] args) {
		E e1 = new E();
		System.out.println("--------");
		E e2 = new E(11);
		System.out.println("--------");
		E e3 = new E(12.12);
		System.out.println("--------");
	}
	
}
