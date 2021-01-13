package cooperation;

public class Texi {

	int texiNumber;
	int money;
	
	public Texi(int texiNumber) {
		this.texiNumber = texiNumber;
	}
	public void take (int money) {
		this.money += money;
	}
	public void showTexiInfo() {
		System.out.println(texiNumber + " 번의 택시 수입은 " + money + " 원입니다.");
	}
}
