package generics;

public class GenericBounded {
	public static void main(String[] args) {
		GenericClassBounded<Integer> obj = new GenericClassBounded();
		obj.display();
	}
}

class GenericClassBounded <T extends Number> {
	public void display() {
		System.out.println("this is a bounded type generic class: ");
	}
}
