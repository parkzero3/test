package coffee;

public class CoffeeTest {

	public static void main(String[] args) {
		Person Kim = new Person("Kim", 10000);
		Person Lee = new Person("Lee", 10000);

		StarCoffee starCoffee = new StarCoffee();
		BeanCoffee beanCoffee = new BeanCoffee();
		
		Kim.takeStarCoffee(starCoffee, Menu.STARAMERICANO);
		Lee.takeBeanCoffee(beanCoffee, Menu.BEANLATTE);
	}

}
