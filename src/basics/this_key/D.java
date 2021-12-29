package basics.this_key;
/*0
 * ##################################
   #            THIS Keyword		#
   ##################################	

--	In order to use more than one constructor while creating an object for 
	initialising non-static member in same class.
	
*/
 
public class D {
	
	D(){
		System.out.println("done");
		this(11); //CTE-- constructor call must be the first statement in a constructor
	}
	
	D(int i){
		System.out.println("done in D cons with int para");
	}
	
	public static void main(String[] args) {
		D d1 = new D();
	}

}
