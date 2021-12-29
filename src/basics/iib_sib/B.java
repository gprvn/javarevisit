package basics.iib_sib;

/**
 * 
 * @author praveenrao
 *
 */
public class B {
	
	static int i;
	B(){
		i++;
	}
	public static void main(String[] args) {
		B b1 = new B();
		B b2 = new B();
		B b3 = new B();
		System.out.println(i);
	}
	
}
