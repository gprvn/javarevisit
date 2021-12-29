package basics.iib_sib;

public class I_Manager {
	static {
		System.out.println("I_Manager-SIB");
	}
	public static void main(String[] args) {
		System.out.println("m1-main begin");
		I.test();
		System.out.println("m1-main end");
	}
}

/**
output::::

I_Manager-SIB
main begin
I-SIB
I-Test
main end
*/