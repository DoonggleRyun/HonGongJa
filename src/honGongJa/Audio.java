package honGongJa;

import honGongJa.chapter_interface.RemoteControl;

public class Audio implements RemoteControl {

	// 인터페이스의 모든 메소드는 기본적으로 public접근 제한을 가진다.
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("turn on");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("turn off");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub

	}

}
