package basics.non_static_management;

public class J {
	int y;
	public static void main(String[] args) {
		J obj1 = new J();
		J obj2 = obj1;
		obj1.y = 5;
		System.out.println(obj2.y);
	}
}
