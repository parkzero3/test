package inheritance;

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
	
	public VIPCustomer(int customerID, String customerName) {  // ����Ʈ �����ڰ� ���� �Ű��������ִ°��� ��ӹ������ 
		super(customerID, customerName);
		
		customerGrade = "VIP";  
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int,String) ȣ���");
	}
	
	//protected : �ܺ� Ŭ�������� private ���� ����Ŭ�������� public �� ����� ������ Ű���� 
	// ����Ŭ������ protected�� ����� ������ �޼���� �ٸ� �ܺ� Ŭ���������� ����� �� ������ ���� Ŭ���������� ��밡��.
	
	
}
