package cooperation;

public class Subway {
	
	int linenumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.linenumber = lineNumber;
	}
	
	public void take(int money) {  //���� �޼���
		this.money += money;
		passengerCount++;
	}
	public void showBusInfo() {
		System.out.println(linenumber + " ���� ����ö �°� ���� " + passengerCount + " ���̸�, ������ "+ money +" ���Դϴ�.");
	}
}
