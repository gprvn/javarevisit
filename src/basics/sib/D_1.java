package basics.sib;

public class D_1 {
	static int number1;
	static {
		System.out.println("from D_1 static");
		System.out.println(number1);
		number1 = 100;
	}
	static void manipulate() {
		System.out.println(number1);
	}
	public static void main(String[] args) {
		System.out.println("from main -- start");
		manipulate();
		System.out.println("form main -- ends");
	}
}
