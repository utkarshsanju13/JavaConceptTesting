package Java8Features;

interface TestInterface1{
	default void show() {
		System.out.println("TestInterface1 default method");
	}
}

interface TestInterface2{
	default void show() {
		System.out.println("TestInterface2 default method");
	}
}

public class ImplementingDefaultMethodInInterface implements TestInterface1,TestInterface2 {
	
	public void show() {
		TestInterface1.super.show();
		TestInterface2.super.show();
	}
	
	public static void main(String[] args) {
		
		ImplementingDefaultMethodInInterface i = new ImplementingDefaultMethodInInterface();
		i.show();
		
	}

}
