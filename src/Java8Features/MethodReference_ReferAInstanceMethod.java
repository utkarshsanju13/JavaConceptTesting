package Java8Features;

interface Walkable{
	void walk();
}

public class MethodReference_ReferAInstanceMethod {

	public void walkSomeStep() {
		System.out.println("Walk Some Step");
	}
	
	public static void main(String[] args) {
		
		MethodReference_ReferAInstanceMethod inst = new MethodReference_ReferAInstanceMethod();
		
		Walkable w = inst::walkSomeStep;
		w.walk();
		
	}
}
