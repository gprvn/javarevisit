package basics.non_static_management;

public class F {
	int i;
	public static void main(String[] args) {
		F f1 = new F();				//create an object to class F
		System.out.println(f1.i);	//that object is assigned to variable f1
									//f1 is pointing to newly created object
									//derived reference varaible / data-type
									// F is datatype
									// new F() 
	}
}
