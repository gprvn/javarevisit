package generics;

public class GenericExample {

	public static void main(String[] args) {
		
		// initialize generic class
	    // with Integer data
		GenericClass<Integer> gc = new GenericClass<>(10);
		System.out.println("Generic class returns: "+gc.getData());
		
		// initialize generic class
	    // with String data
		GenericClass<String> gc1 = new GenericClass<>("praveen");
		System.out.println("Generic class returns: "+gc1.getData());
	}

}

class GenericClass<T> {
	private T data;

	public GenericClass(T data) {
		this.data = data;
	}

	public T getData() {
		return this.data;
	}
}
