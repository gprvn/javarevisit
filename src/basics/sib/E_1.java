package basics.sib;

public class E_1 {
	static int number2;
	static {
		System.out.println(number2);
		number2 = 200;
	}
	static void manipulate() {
		System.out.println(++number2);
	}
	public static void main(String[] args) {
		System.out.println("E_1 main -- start");
		System.out.println(number2);
		manipulate();
		D_1.main(args);
		System.out.println("E_1 main -- ends");
	}
}
