package Java8Features;

interface Message{
	void getMessage();
}
public class MethodReference_ReferAConstructor {
	
	MethodReference_ReferAConstructor(){
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		
		
		Message msg = MethodReference_ReferAConstructor::new;
		msg.getMessage();
	}

}
