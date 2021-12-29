package basics.iib_sib;

public class I_Manager_2 {
	
	static {
		System.out.println("SIB-Manager2");
	}
	public static void main(String[] args) {
		System.out.println("m2-main-begin");
		I i1 = new I();
		i1.test();
		System.out.println("m2-main-end");
	}
}


/**
	m2-main-begin
	I-Test
	m2-main-end
*/