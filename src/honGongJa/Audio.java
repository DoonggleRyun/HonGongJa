package honGongJa;

import honGongJa.chapter_interface.RemoteControl;

public class Audio implements RemoteControl {

	// �������̽��� ��� �޼ҵ�� �⺻������ public���� ������ ������.
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
