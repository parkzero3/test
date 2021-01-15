package practice;

public class VIPCustomer extends Customer{

	double salesRatio;
	private int agentID;
	
	/*public VIPCustomer() {
		super();
		customerGrade = "VIP";  // ��ӽ� protected �� ���� �ϸ� ��밡�� private ���Ұ��� 
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() ȣ���");
	}
	*/
	
	public VIPCustomer(int customerID, String customerName, int agentID) {  // ����Ʈ �����ڰ� ���� �Ű��������ִ°��� ��ӹ������ 
		super(customerID, customerName);
		
		customerGrade = "VIP";  
		bonusRatio = 0.05;
		salesRatio = 0.1;
		this.agentID = agentID;
		
		System.out.println("VIPCustomer(int,String) ȣ���");
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price *bonusRatio;
		return price - (int)(price * salesRatio);
		
	}
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " ��� ���� ��ȣ�� "+ agentID + " �Դϴ�.";
	}
	
	//protected : �ܺ� Ŭ�������� private ���� ����Ŭ�������� public �� ����� ������ Ű���� 
	// ����Ŭ������ protected�� ����� ������ �޼���� �ٸ� �ܺ� Ŭ���������� ����� �� ������ ���� Ŭ���������� ��밡��.
	

}
