package basics.non_static_management;

//0
public class Q {
	int i,j = 10;
	static void print(Q obj) {
		System.out.println(obj.i);
		System.out.println(obj.j);
	}
	public static void main(String[] args) {
		Q q1 = new Q();
		System.out.println(q1);
		q1.i = 100;
		q1.j = 200;
		System.out.println(q1);
	}
}
