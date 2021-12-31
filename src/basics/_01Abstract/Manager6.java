package basics._01Abstract;

abstract class G {
	abstract void test1();
	abstract void test2();
	abstract void test3();
}

abstract class H extends G {
	void test2() {
		System.out.println("test2");
	}
}

class I extends H {

	@Override
	void test1() {
		System.out.println("test1");
	}

	@Override
	void test3() {
		System.out.println("test3");
	}
	
}

public class Manager6 {
	public static void main(String[] args) {
		I i1 = new I();
		i1.test1();
		i1.test2();
		i1.test3();
	}
}
