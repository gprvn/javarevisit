package basics.non_static_management;


//	0
public class P {
	int i = 10;
	static void test(P obj) {
		System.out.println("a: "+obj.i);
		obj.i = 20;
		System.out.println("b: "+obj.i);
	}
	public static void main(String[] args) {
		P p1 = new P();
		test(p1);
		System.out.println("c: "+p1.i);
		p1.i = 100;
		test(p1);
		System.out.println("d: "+p1.i);
	}
}
