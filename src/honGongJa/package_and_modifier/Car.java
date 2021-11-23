package honGongJa.package_and_modifier;

/* 일반적으로 객체 지향 프로그래밍에서는 객체의 필드를 객체 외부에서 직접적으로 접근하는 것을 막는다
 * 그 이유는 외부에서 마음대로 변경할 경우 객체의 무결성이 깨질 수 있기 때문이다. 예를 들어 자동차의 속도는 음수가 될 수 없는데, 
 * 외부에서 음수로 변경하면 객체의 무결성이 깨진다.
 * 이러한 문제점을 해결하기 위해 객체 지향 프로그래밍에서는 메소드를 통해서 필드를 변경하는 방법을 선호한다.
 * 필드는 외부에서 접근할 수 없도록 막고, 메소드는 공개해서 외부에서 메소드를 통해 필드에 접근하도록 유도한다.
 * 그 이유는 메소드는 매개값을 검증해서 유효한 값만 객체의 필드로 저장할 수 있기 때문이다 ( 별표 세개)
 * 그런 역할을 하는 게 setter다.
 * 
 * 
 * 클래스를 선언할 때 가능하다면 필드를 private로 선언해서 외부로부터 보호하고, 필드에 대한 setter와 getter메소드를 작성해서
 * 필드값을 안전하게 변경/사용하는 것이 좋다.
 * 
*/

public class Car {

	private int speed;
	private boolean stop;

	// 생성자

	// 메소드
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}

	public boolean isstop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}

}
