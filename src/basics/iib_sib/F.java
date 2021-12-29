package basics.iib_sib;

public class F {
	static int i;
	F(){
		i = 11;
	}
	{
		i = 11;
	}
	void hello() {
		i = 32;
	}
	
	public static void main(String[] args) {
		System.out.println(i);					//
		System.out.println("------------");		//--------
		F f1 = new F();
		System.out.println(i);					//11
		System.out.println("------------");		//---------
		f1.hello();
		System.out.println(i);					//32
		System.out.println("------------");		//---------
		F f2 = new F();
		System.out.println(i);					//11
	}
}
