package basics.this_key;

/**	0

##################################
#           THIS Keyword		 #
##################################	

--	In order to use more than one constructor while creating an object for 
	initialising non-static member in same class.
	
*/

public class A {
	
	int i;
	A(){
		System.out.println("A");
		i = 0;
	}
	
	A(int i){
		this();
		System.out.println("F-i");
	}
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println("-------");
		
		A a2 = new A(1);
		System.out.println("-------");
		
		System.out.println(a1.i+"-----"+a2.i);
	}
}
