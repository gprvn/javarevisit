package basics.inheritance;

class G {
	int i;
	void print() {
		System.out.println(i+" from print");
	}
}

class H extends G {
	int j;
	void printAll() {
		print();
		System.out.println(i+"from printAll");
		System.out.println(j+"from printAll");
	}
}

public class Manager4 {
	
	public static void main(String[] args) {
		H h1 = new H();
		h1.i = 22;
		h1.j = 33;
		h1.printAll();
		h1.print();
		
		G g1 = new G();
		g1.i = 44;
		g1.print();
	}
	
	/**
	 * Output:
	 * 22 from print
	 * 22 from printAll
	 * 33 from printAll
	 * 44 from print
	 */

}
