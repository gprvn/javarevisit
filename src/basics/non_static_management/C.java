package basics.non_static_management;

//0
public class C {
	static int i;
	static {
		i = 10; //can not make reference to the non-static field
	}
}
