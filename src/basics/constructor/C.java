package basics.constructor;

public class C {
	C(int i){
		System.out.println("con");
	}
	public static void main(String[] args) {
		C obj = new C(); //The constructor C() is undefined
		System.out.println("done");
	}
}
