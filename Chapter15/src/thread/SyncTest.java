package thread;


//synchronized  한 수행을 마친후에  다른 thread 실행  블럭방식이 안전한 방법

// run 메서드에 synchronized 사용시 블럭방식으로 해야함 

class Bank{
	private int money = 10000;
	
	public void saveMoney(int save) {  //블럭 방식으로 동기화
		
		synchronized (this) {
				
			int m = this.getMoney();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			setMoney(m + save);
		}
		
	}
	
	public synchronized void minusMoney(int minus) {  // 메서드로 동기화시 
		
		int m = this.getMoney();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setMoney(m - minus);
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
		
}

class Park extends Thread {
	
	public void run() {
		System.out.println("start save");
		SyncTest.myBank.saveMoney(3000);
		System.out.println("save Money: " + SyncTest.myBank.getMoney());
	}
}

class ParkWife extends Thread {
	
	public void run() {
		System.out.println("start minus");
		SyncTest.myBank.minusMoney(1000);
		System.out.println("minus Money: " + SyncTest.myBank.getMoney());
	}
}

public class SyncTest {

	public static Bank myBank = new Bank();
	
	public static void main(String[] args) throws InterruptedException {
		
		Park p = new Park();
		p.start();
		
		Thread.sleep(200);
		
		ParkWife pw = new ParkWife();
		pw.start();

	}

}
