package basics.inheritance;

class I {
	int m;
	void test1() {
		System.out.println("test1: "+m);
	}
}

class J extends I {
	int n;
	void test2() {
		System.out.println("test2: "+m);
		System.out.println("test2: "+n);
	}
}

public class Manager5 {
	
	public static void main(String[] args) {
		I i = new I();
		i.m = 22;
		i.test1();
		
		J j = new J();
		j.m = 33;
		j.n = 44;
		j.test1();
		j.test2();
	}
/**
 * test1 22
 * test1 33
 * test2 33
 * test2 44
 */
}
