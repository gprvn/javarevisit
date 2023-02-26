package basics.non_static_management;

public class B {
	static void test() {
		
	}
	public static void main(String[] args) {
		test(); // can not make a static reference to the non-static method
	}
}
