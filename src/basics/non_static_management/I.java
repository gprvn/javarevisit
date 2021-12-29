package basics.non_static_management;

//0
public class I {
	int x;
	public static void main(String[] args) {
		I obj1 = new I();
		System.out.println(obj1.x);
		obj1.x = 20;
		
		I obj2 = new I();
		System.out.println(obj2.x);
		obj2.x = 200;
		
		System.out.println(obj1.x);
		System.out.println(obj2.x);
	}
}	
