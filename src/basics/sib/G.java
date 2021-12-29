package basics.sib;

public class G {
	static int i = 2;
	static void test() {
		System.out.println("G.test - "+i);
		i = 3;
	}
	static {
		System.out.println("G-SIB-"+i);
		i = 4;
	}
	public static void main(String[] args) {
		System.out.println("G-main-being-"+i);
		System.out.println("-----------------");
		F.test();
		System.out.println("-----------------");
		test();
		System.out.println("-----------------");
		F.main(args);
	}
}
