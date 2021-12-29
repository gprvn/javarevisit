package basics.this_key;

/*0
		##################################
		#           THIS Keyword		 #
		##################################	

--	In order to use more than one constructor while creating an object for 
	initialising non-static member in same class.
	
*/
public class C {
	
	int i;
	double j;
	C(){
		System.out.println("C()");
		i = 11;
		j = 22.33;
	}
	
	C(int m){
		this();
		System.out.println("C(int)");
		i = m;
	}
	
	C(double m){
		this(11);
		System.out.println("C(double)");
		j = m;
	}
	
	C(int m, double n){
		this(n);
		System.out.println("G(int, double)");
		i = m;
	}
	
	C(double m,int n){
		this(n,m);
		System.out.println("double, int");
	}
	
	public static void main(String[] args) {
		C c1 = new C();
		System.out.println("------------");
		C c2 = new C(100);
		System.out.println("------------");
		C c3 = new C(2.11);
		System.out.println("------------");
		C c4 = new C(21, 21.22);
		System.out.println("------------");
		C c5 = new C(21.11, 5);
		System.out.println("------------");
	}

}
