package basics.inheritance;

/**
 * 
 * @author praveenrao
 *	constructor chain by using SUPER keyword
 */
class K {
	K(){
		System.out.println("K()");
	}
}

class L extends K {
	L(){
		System.out.println("L()");
	}
}
public class Manager6 {
	public static void main(String[] args) {
		K k1 = new K();
		System.out.println("---------");
		
		L l1 = new L();
		System.out.println("--------");
	}
}
