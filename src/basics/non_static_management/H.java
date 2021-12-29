package basics.non_static_management;

//0
public class H {
	int i;
	void test() {
		System.out.println("from test");
	}
	public static void main(String[] args) {
		H obj = new H();
		obj.i = 10;
		obj.test();
		System.out.println(obj.i);
	}
}
