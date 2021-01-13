package coffee;

public class Person {

	String name;
	int money;
	
	public Person(String name, int money) {
		this.name= name;
		this.money = money;
	}
	
	public void takeStarCoffee(StarCoffee sCoffee, int money) {
		String message = sCoffee.brewing(4000);
		if(message != null) {
			this.money -= money;
			System.out.println(name  + " 님이" + money + " 원 으로 " + message);
		}
	}
	public void takeBeanCoffee(BeanCoffee bCoffee , int money) {
		String message = bCoffee.brewing(4400);
		if(message != null) {
			this.money -= money;
			System.out.println(name  + " 님이" + money + " 원 으로 " + message);
		}
	}
}
