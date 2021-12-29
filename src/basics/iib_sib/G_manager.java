package basics.iib_sib;

import basics.iib_sib.G.H;

public class G_manager {
	public static void main(String[] args) {
		G g1 = new G();
		H h1 = g1.new H();
		h1.print();
		System.out.println("done");
	}
}
