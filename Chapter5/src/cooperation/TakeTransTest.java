package cooperation;

public class TakeTransTest {

	public static void main(String[] args) {
		Student studentJ = new Student("James" , 5000);
		Student studentT = new Student("Tomas", 10000);
		Student studentE = new Student("Edward" ,10000);
		
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		Bus bus300 = new Bus(300);
		Bus bus400 = new Bus(400);
		Bus bus500 = new Bus(500);
		
		Subway subwayGreen = new Subway(2);
		Subway subwayBlue = new Subway(4);

		Texi texi100 = new Texi(100);
		
		studentJ.takeBus(bus100);
		studentT.takeSubway(subwayGreen);
		studentE.takeTexi(texi100);
		
		studentJ.showInfo();
		studentT.showInfo();
		studentE.showInfo();
		
		bus100.showBusInfo();
		bus500.showBusInfo();
		
		subwayBlue.showBusInfo();
		subwayGreen.showBusInfo();
		
		texi100.showTexiInfo();
		

	}

}
