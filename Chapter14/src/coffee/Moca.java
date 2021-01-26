package coffee;

public class Moca extends Decorator{

	public Moca(Coffee coffee) {
		super(coffee);
	}
	public void brewing() {
		super.brewing();
		System.out.print("Adding Moca");
	}
	
}
