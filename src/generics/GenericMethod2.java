package generics;

public class GenericMethod2 {
	public static void main(String[] args) {
		DemoClass2 demo = new DemoClass2();
		demo.testMethod("test string");
	}
}

class DemoClass2 {
	public <T> void testMethod(T data) {
		System.out.println(data);
	}
}