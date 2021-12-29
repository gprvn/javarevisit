package basics.inheritance;

class C {
	int i,j;
}

class D extends C {
	int m,n;
}
public class Manager2 {
	public static void main(String[] args) {
		C c1 = new C();
		 c1.i = 1;
		 c1.j = 2;
		 
		D d1 = new D();
		d1.i = 3;
		d1.j = 4;
		d1.m = 5;
		d1.n = 6;
		
		System.out.println(c1.i);
		System.out.println(c1.j);
		System.out.println(d1.i);
		System.out.println(d1.j);
		System.out.println(d1.m);
		System.out.println(d1.n);
	}
}
