package basics.sib;

public class D {
	
	// 0
	static int i;
	static {
		System.out.println(i);
		i = 10;
	}
	public static void main(String[] args) {
		int j = 12;
		System.out.println(i);
		System.out.println(j);
	}
}


