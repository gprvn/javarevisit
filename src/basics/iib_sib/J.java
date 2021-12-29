package basics.iib_sib;

public class J {
	
	J(){
		System.out.println("J");
	}
	
	J(int i){
		this();
		System.out.println("J - i");
	}
	{
		System.out.println("IIB");
	}
	public static void main(String[] args) {
		J j1 = new J();
		System.out.println("------");
		
		J j2 = new J(11);
		System.out.println("------");
	}
	
	/**
	 * OUTPUT:
	 * IIB
	 * J
	 * -----
	 * IIB
	 * J
	 * J - i
	 * -----
	 */
	
}
