package Java8Features;

public class LambdaCreatingThread {
	
	public static void main(String[] args) {
		
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Without lambda thread");
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
		
		Runnable r2 = ()->{
			System.out.println("Using lambda declaring thread");
		};
		
		Thread t2 = new Thread(r2);
		t2.start();
	}

}
