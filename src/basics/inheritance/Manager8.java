package basics.inheritance;

class P {
	P(){
		System.out.println("P()");
	}
}

class Q extends P {
	Q(){
		this(90);
		System.out.println("Q()");
	}
}

class R extends Q {
	R(){
		System.out.println("R()");
	}
	R(int i){
		this();
		System.out.println("R(int)"+i);
	}
}


public class Manager8 {

}
