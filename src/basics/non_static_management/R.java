package basics.non_static_management;

//	0
public class R {
	int i;
	static R test() {
		R r1 = new R();
		r1.i = 100;
		return r1;
	}
	public static void main(String[] args) {
		R obj = test();
		System.out.println(obj.i);
	}
}
