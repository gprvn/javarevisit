package basics.non_static_management;

public class D {
	void test() {
		System.out.println("done");
	}
	public static void main(String[] args) {
		test(); // can not make a static reference to the non static method test
	}
}
