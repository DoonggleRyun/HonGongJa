package honGongJa.method;


public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if (gasState) {
			System.out.println("출발");
			myCar.run();
		}

		if (myCar.isLeftGas()) {
			System.out.println("가스를 주입할 필요 없음");
		}else {
			System.out.println("가스를 주입하세요.");
		}
		
	}

}
