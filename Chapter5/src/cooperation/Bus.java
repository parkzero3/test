package cooperation;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {  //승차 메서드
		this.money += money;
		passengerCount++;
	}
	public void showBusInfo() {
		System.out.println(busNumber + " 번의 버스의 승객 수는 " + passengerCount + " 명이며, 수입은 "+ money +" 원입니다.");
	}
}
