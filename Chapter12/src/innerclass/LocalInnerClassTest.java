package innerclass;

class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		
		int num =100;
		
		class MyRunnable implements Runnable {

			@Override
			public void run() {
				
				//num += 10;  //참조는 할수있지만 변경은 할수없음 ( 상수 이기때문 / 로컬변수는 실행하고 사라짐 )
				//i = 200;
				
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
				
			}
			
		}
		
		return new MyRunnable();
	}
}
public class LocalInnerClassTest {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();
		

	}

}
