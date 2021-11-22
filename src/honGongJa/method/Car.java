package honGongJa.method;

/*메소드 선언은 선언부와 실행 블록으로 구성된다. 
리턴타입은 리턴값의 타입을 말한다. 리턴값이랑 메소드를 실행한 후의 결과값.
메소드는 리턴값이 있을 수도 있고 없을 수도 있으나 리턴값이 있을 경우 리턴 타입이 선언부에 명시돼야 합니다.

리턴 값이 없는 메소드 Void
리턴값이 없는 메소드는 리턴 타입으로 void를 사용한다. 그런데 void로 선언된 메소드에서도 return문을 사용 할 수 있다.
그리고 그건 리턴값을 지정하는 것이 아니라 메소드 실행을 강제 종료시키는 역할을 한다.

*
*/

public class Car {

	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		
		if (gas == 0) {
			System.out.println("out of gas");
			return false;
		}
		System.out.println("we do have it");
		return true;
	}
	
	void run() {
		while (true) {
			if(gas > 0) 
			{
				System.out.println("run. gas잔량은 : " + gas);
				gas -= 1;
			}else {
				System.out.println("stop gas잔량은 : " + gas);
				return; // 메소드 실행종료.

			}
		}
	}
}
