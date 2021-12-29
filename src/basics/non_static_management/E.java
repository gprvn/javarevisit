package basics.non_static_management;

//0
public class E {
	int i;
	void test() {
		
	}
	static void test() {
		i = 10;
		test();
	}
}
