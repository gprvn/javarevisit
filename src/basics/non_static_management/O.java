package basics.non_static_management;
/*
 * reference varaible
 */

//0
public class O {

	int i;
	static void test(O o1) {
		System.out.println("from test: "+o1.i);
	}
	public static void main(String[] args) {
		O o1 = new O();
		test(o1);
		o1.i = 10;
		test(o1);
		System.out.println("from main: "+o1.i);
	}
	
}
