package honGongJa.chapter_interface;

/* 인터페이스 구현
 * 개발 코드가 인터페이스 메소드를 호출하면 인터페이스는 객체의 메소드를 호출한다.
 * 객체는 인터페이스에서 정의된 추상 메소드와 동일한 메소드이름, 매개 타입, 리턴타입을 가진 실체 메소드를 가지고 있어야 한다.
 * 이러한 객체를 인터페이스의 구현 객체라고 하고, 구현 객체를 생성하는 클래스를 구현 클래스라고 한다.
 * 
 * 구현 클래스는 보통의 클래스와 동일한데,인터페이스 타입으로 사용할 수 있음을 알려주기 위해 클래스 선언부에 implements키워드를 추가하고
 * 인터페이스 이름을 명시해야 한다. 그리고 인터페이스에 선언된 추상 메소드의 실체 메소드를 선언해야 함.
 * 
 * */




public class Television implements RemoteControl {

	private int volume;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println(" TV를 켬");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV 끔");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub

		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else this.volume = volume;
		
		System.out.println("현재 볼륨: "+  this.volume);
	}

}
