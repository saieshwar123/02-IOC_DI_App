package in.eshwar;

public class Car {
	
	private IEngine e;
	Car(IEngine e){
		this.e=e;
	}
	
	public void drive() {
		int start=e.start();
		if(start>=1)System.out.println("Engine Started");
		else System.out.println("No engine Started");
		System.out.println("123");
	       System.out.println("456");

	}
	
	
}
