package thread;

class MyThread implements Runnable{
	
	public void run() {
		int i;
		
		for (i =0; i<=200; i++) {
			System.out.print(i + "\t");
			
			try {
				// sleep(100);  extends Thread �Ұ��
				Thread.sleep(100); //implement Runnable �Ұ��
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println("start");
		//extends Thread �Ұ��
		/*MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		th1.start();
		th2.start();
		*/
		
		////implement Runnable �Ұ��
		
		MyThread runner1 = new MyThread();
		Thread th1 = new Thread(runner1);
		th1.start();
		
		MyThread runner2 = new MyThread();
		Thread th2 = new Thread(runner2);
		th2.start();
		
		System.out.println("end");

	}

}
