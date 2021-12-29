package basics.non_static_management;


//	0
public class M {
	int i;
	static void test() {
		M m1 = new M();
		m1.i = 10;
		System.out.println("from test: "+m1.i);
	}
	public static void main(String[] args) {
		test();
		System.out.println("done");
	}
}
