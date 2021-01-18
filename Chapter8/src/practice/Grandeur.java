package practice;

public class Grandeur extends Car{

	@Override
	public void start() {
		System.out.println("그랜져 시동을 켭니다.");
		
	}

	@Override
	public void drive() {
		System.out.println("그랜져 주행을 합니다.");

		
	}

	@Override
	public void stop() {
		System.out.println("그랜져 멈춥니다.");

		
	}

	@Override
	public void turnOff() {
		System.out.println("그랜져 시동을 끕니다.");

		
	}

}
