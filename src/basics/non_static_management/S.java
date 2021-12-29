package basics.non_static_management;

//0
public class S {
	int i;
	static S test() {
		S s1 = new S();
		s1.i = 100;
		test2(s1);
		return s1;
	}
	private static void test2(S s1) {
		s1.i = 200;
	}
	public static void main(String[] args) {
		S obj = test();
		System.out.println(obj.i);
	}
}
