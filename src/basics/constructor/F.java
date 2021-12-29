package basics.constructor;


//	0
public class F {
	int i;
	F(){
		System.out.println("F -- "+i);
		i = 10;
	}
	
	public static void main(String[] args) {
		E e1 = new E();
		System.out.println("--------");
		E e2 = new E();
		System.out.println("--------");
		System.out.println(e1.i);
		System.out.println(e2.i);
	}
}
