package innerclass;

class Outer2{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		
		int num =100;
		
		return new Runnable() {

			@Override
			public void run() {
				
				//num += 10;  //참조는 할수있지만 변경은 할수없음 ( 상수 이기때문 / 로컬변수는 실행하고 사라짐 )
				//i = 200;
				
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
				
			}
			
		};
		
	}
	
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("test");
			
		}
	};
}
public class AnonymousInnerClassTest {

	public static void main(String[] args) {
		Outer2 outer = new Outer2();
		outer.runner.run();
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();
		

	}

}
