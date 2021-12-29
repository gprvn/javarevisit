package basics.sib;

/*
 * praveen_rao_gujju
 * 
 */
public class B {

	// 0
	static int i = 10;
	static {
		System.out.println(1); // 1
		System.out.println(i); // 2
		B.i = 100; // 3
	}

	static void test() {
		System.out.println(2); // 8
		System.out.println(i); // 9
		i = 200; // 10
	}

	public static void main(String[] args) {
		System.out.println(3); // 4
		System.out.println(i); // 5
		i = 300; // 6
		test(); // 7
		System.out.println(i); // 11
	}
}
