package basics.sib;

public class E {
	static int j = 10;
	static {
		System.out.println(E.j); //1
		E.j = 100;	//2
	}
	public static void main(String[] args) {
		System.out.println(E.j);	//3
		System.out.println("-------");	//4
		D.main(args);	//5
	}
}
