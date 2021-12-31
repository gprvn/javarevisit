package basics._02Interface;

interface IFace {
	void test1();
}

abstract class J implements IFace{
	abstract void test2();
}

abstract class K extends J{
	public void test1() {
		System.out.println("test1");
	}
	void test2() {
		System.out.println("test2");
	}
}

class L extends K{
	
}

public class Manager4 {
	public static void main(String[] args) {
		L l1 = new L();
		l1.test1();
		l1.test2();
	}
}
