package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010,"�̼���");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim =new VIPCustomer(10020,"������");
		customerKim.bonusPoint = 10000;
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		System.out.println(customerLee.showCustomerInfo() + " ���ұݾ��� " + priceLee + " �� �Դϴ�.");
		System.out.println(customerKim.showCustomerInfo() + " ���ұݾ��� " + priceKim + " �� �Դϴ�.");
		
		Customer customerNo = new VIPCustomer(10030, "������");
		customerNo.bonusPoint =10000;
		System.out.println(customerNo.showCustomerInfo() + " ���ұݾ��� " + customerNo.calcPrice(10000) + " �� �Դϴ�.");
		// calcPrice �� �ν��Ͻ� ( VIP ) �� �޼���= �ν��Ͻ��� �ҷ��� (�����Լ�)
		// ����޼��� = Customer vc = newVIPCustomer();
		// vc.calcPrice(10000); ȣ��� 
		// �ڹٴ� �ν��Ͻ� ( VIP ) �� calcPrice �� ȣ���� (�����ǵ� ���(�޼��� �ּҸ� ����ã�ư�))
		// Ÿ���� �켱�� �ƴ� �ν��Ͻ��� �켱

	}
}
