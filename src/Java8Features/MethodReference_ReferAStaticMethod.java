package Java8Features;

interface Sayable{
	public void say();
}
public class MethodReference_ReferAStaticMethod {
	
	public static  void saySomething() {
		System.out.println("SaySomething method");
	}
	
	public static void main(String[] args) {
	
		Sayable s = MethodReference_ReferAStaticMethod::saySomething;
		
		s.say();
		
		Thread t = new Thread(MethodReference_ReferAStaticMethod::saySomething);
		t.start();
	}
	
	
	

}
