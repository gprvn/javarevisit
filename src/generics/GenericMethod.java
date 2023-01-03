package generics;

public class GenericMethod {
	public static void main(String[] args) {
		DemoClass demo = new DemoClass();
		demo.<String>genericMethod("praveen");
		demo.<Integer>genericMethod(123);
		boolean isit = true;
		demo.genericMethod(isit);
		demo.genericMethod(12.12);
	}
}

class DemoClass {
	public <T> void genericMethod(T data) {
		System.out.println("Generic method:");
		System.out.println("Data passed: "+data);
	}
}
