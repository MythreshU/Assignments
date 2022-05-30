package mythresh;

//a class is either public or default
//final class is not supported for inheritance ,when we can't inherit it then how to provide implementation for abstract method ,
//abstract class not a final
abstract class Main {
	// if a class contain abstract method then class must be abstract
	public abstract void meth();
}

class Derived_class extends Main {
	// in child class we need to provide implementation to abstract method
	@Override
	public void meth() {
		// TODO Auto-generated method stub

	}

}

public class DriverClass {
	public static void main(String[] args) {
		// we cannot instantiate a abstract class
		// Main m=new Main();
	}
}
