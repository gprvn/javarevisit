package basics.non_static_management;

/**
 * 
 * @author praveenrao
 *	null pointer exception
 *
 *	0
 */
public class L {
	int i;
	public static void main(String[] args) {
		L obj = new L();
		obj.i = 10;
		System.out.println(obj.i);
		obj = null; //default literal to any of the derived data type
		System.out.println("done");
		System.out.println(obj.i);  //	when object doesn't have any reference from stack
									// 	then that object is known as dead/abounded object.
									//	If object have one ref variable that object is called as live object.
	}
}
