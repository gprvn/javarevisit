package generics;

public class GenericClassExample {
	public static void main(String[] args) {
		GenericClassTest<String> test = new GenericClassTest("name");
		System.out.println(test.getData());
	}
}

class GenericClassTest<T> {
	private T data;

	public GenericClassTest(T data) {
		this.data = data;
	}

	public T getData() {
		return this.data;
	}
}
