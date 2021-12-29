package basics.iib_sib;

/**
 * 
 * @author praveenrao
 *
 */
public class C {
	
	static int i;
	C(){
		i++;
	}
	public static void main(String[] args) {
		C c1 = new C();
		System.out.println(c1.i);
		C c2 = new C();
		System.out.println(c2.i);
		C c3 = new C();
		System.out.println(c3.i);
	}

}
