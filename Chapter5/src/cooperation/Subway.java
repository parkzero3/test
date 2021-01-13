package cooperation;

public class Subway {
	
	int linenumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.linenumber = lineNumber;
	}
	
	public void take(int money) {  //승차 메서드
		this.money += money;
		passengerCount++;
	}
	public void showBusInfo() {
		System.out.println(linenumber + " 번의 지하철 승객 수는 " + passengerCount + " 명이며, 수입은 "+ money +" 원입니다.");
	}
}
