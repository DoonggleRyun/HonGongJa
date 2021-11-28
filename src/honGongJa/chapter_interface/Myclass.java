package honGongJa.chapter_interface;

//구현 객체가 인터페이스 변수에 대입된다는 것을 알았으니, 지금부터 인터페이스로 구현 객체를 사용하는 방법을 알아보겠다.
public class Myclass {

	
	
	RemoteControl rc = new Television();
	//인터페이스가 필드 타입으로 사용될 경우, 필드에 구현 객체를 대입할 수 있다.
	
	Myclass(){
		
	}
	 
	Myclass(RemoteControl rc) {
		// TODO Auto-generated constructor stub
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	// 인터페이스가 생성자의 매개 변수 타입으로 사용될경우, new 연산자로 객체를 생성할 때 구현 객체를 생성자의 매개값으로 대입 할 수 있다.
	
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	// 인터페이스가 로컬 변수 타입으로 사용될 경우, 변수에 구현 객체를 대입할 수 있다.
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
	//인터페이스가 메소드의 매개 변수 타입으로 사용될 경우, 메소드 호출 시 구현 객체를 매개값으로 대입할 수 있따.
	
	
}
