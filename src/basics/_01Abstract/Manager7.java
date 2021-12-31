package basics._01Abstract;

abstract class J{
	abstract void test1();
	abstract void test2();
	abstract void test3();
}

abstract class K extends J{
	
}

abstract class L extends K{
	void test5() {
		System.out.println("test5");
	}
	abstract void test4();
}

abstract class M extends L{
	void test1() {
		System.out.println("test1");
	}
}

abstract class N extends M {
	void test2() {
		System.out.println("test2");
	}
	void test3() {
		System.out.println("test3");
	}
}

public class Manager7 extends N{

	@Override
	void test4() {
		System.out.println("test4");
	}
	public static void main(String[] args) {
		Manager7 m = new Manager7();
		m.test1();
		m.test2();
		m.test3();
		m.test4();
		m.test5();
	}

}
