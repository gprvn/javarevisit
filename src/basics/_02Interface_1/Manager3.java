package basics._02Interface_1;

interface H {
	void test1();
}

interface I extends H {
	void test2();
}

class J implements I {

	@Override
	public void test1() {
		System.out.println("test1");
	}

	@Override
	public void test2() {
		System.out.println("test2");
	}
	
}

public class Manager3 {
	public static void main(String[] args) {
		J j1 = new J();
		j1.test1();
		j1.test2();
	}
}
