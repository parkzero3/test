package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010,"이순신");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim =new VIPCustomer(10020,"김유신");
		customerKim.bonusPoint = 10000;
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		System.out.println(customerLee.showCustomerInfo() + " 지불금액은 " + priceLee + " 원 입니다.");
		System.out.println(customerKim.showCustomerInfo() + " 지불금액은 " + priceKim + " 원 입니다.");
		
		Customer customerNo = new VIPCustomer(10030, "나몰라");
		customerNo.bonusPoint =10000;
		System.out.println(customerNo.showCustomerInfo() + " 지불금액은 " + customerNo.calcPrice(10000) + " 원 입니다.");
		// calcPrice 는 인스턴스 ( VIP ) 의 메서드= 인스턴스를 불러옴 (가상함수)
		// 가상메서드 = Customer vc = newVIPCustomer();
		// vc.calcPrice(10000); 호출시 
		// 자바는 인스턴스 ( VIP ) 의 calcPrice 를 호출함 (재정의된 경우(메서드 주소를 통해찾아감))
		// 타입이 우선인 아닌 인스턴스가 우선

	}
}
