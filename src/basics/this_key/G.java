package basics.this_key;

/**
 * 
 * @author praveenrao
 *
 */
public class G {

	G() {
		System.out.println("Const L");
	}

	G(int i) {
		System.out.println("Const L Para");
	}

	public static void main(String[] args) {
		G g1 = new G();
		G g2 = new G(11);
	}

}
