package basics.non_static_management;

public class A {
	int i;
	public static void main(String[] args) {
		System.out.println(i); //non-static field be to be initialised first
	}
}
