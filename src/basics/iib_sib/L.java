package basics.iib_sib;

/**
 * 
 * @author praveenrao
 *
 */
public class L {

	int i;
	static int j;
	void test1() {
		i = 11;
		j = 22;
	}
	static void test2() {
		L l1 = new L();
		l1.i = 111;
		L.j = 222;
	}
	
}
