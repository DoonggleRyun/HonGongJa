package honGongJa.package_and_modifier;

public class CarExample {
	
	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.setSpeed(-50);
		System.out.println("speed: " + myCar.getSpeed());

		myCar.setSpeed(70);
		if (!myCar.isstop()) {
			myCar.setStop(true);
		}

		System.out.println("speed: " + myCar.getSpeed());

	}

}
