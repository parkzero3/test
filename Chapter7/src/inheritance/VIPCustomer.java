package inheritance;

public class VIPCustomer extends Customer{

	double salesRatio;
	private int agentID;
	
	/*public VIPCustomer() {
		super();
		customerGrade = "VIP";  // 상속시 protected 로 변경 하면 사용가능 private 사용불가능 
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() 호출됨");
	}
	*/
	
	public VIPCustomer(int customerID, String customerName) {  // 디폴트 생성자가 없고 매개변수가있는것을 상속받을경우 
		super(customerID, customerName);
		
		customerGrade = "VIP";  
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int,String) 호출됨");
	}
	
	//protected : 외부 클래스에는 private 으로 하위클래스에서 public 의 기능을 구현한 키워드 
	// 상위클래스에 protected로 선언된 변수나 메서드는 다른 외부 클래스에서는 사용할 수 없지만 하위 클래스에서는 사용가능.
	
	
}
