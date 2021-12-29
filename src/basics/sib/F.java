package basics.sib;

public class F {
	//0
	static int i = 1;
	static {
		System.out.println("SIB1 - "+i);
		i = 10;
	}
	static void test() {
		System.out.println("F.test - "+i);
		i = 20;
	}
	static {
		test();
		System.out.println("F-SIB2-"+i);
		i = 30;
	}
	public static void main(String[] args) {
		System.out.println("F-main-begin:"+i);
		test();
		System.out.println("F-main-end"+i);
	}
}

