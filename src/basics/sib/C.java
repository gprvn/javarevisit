package basics.sib;

public class C {
	static int i = 1;
	static int j = 2;
	
	static {
		System.out.println(1);	//1
		System.out.println(i+", "+j);	//2
		System.out.println(C.i+", "+C.j);	//3
		i = 10;	//4
		C.j = 20;	//5
	}
	static void test() {
		System.out.println(2);	//12
		System.out.println(i+", "+j);	//13
		System.out.println(C.i+", "+C.j);	//14
		i = 100;	//15
		C.j = 202;	//16
	}
	static {
		System.out.println(3);	//6
		System.out.println(i+", "+C.j);	//7
		System.out.println(C.i+", "+C.j);	//8
		C.i = 40;	//9
		j = 50;	//10
		test();	//11
	}
	public static void main(String[] args) {
		System.out.println(4);	//17
		System.out.println(i+","+C.j);	//18
		System.out.println(C.i+", "+C.j);	//19
		C.i = 400;	//20
		C.j = 500;	//21
		test();
		System.out.println(i+", "+C.j);
		System.out.println(C.i+", "+j);
	}
}
