package basics.non_static_management;

public class G {
	void test() {
		System.out.println("from test");
	}
	public static void main(String[] args) {
		G g1 = new G();
		g1.test();
	}
}
