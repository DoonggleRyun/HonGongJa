package honGongJa.chapter_interface;

/* �������̽� ����
 * ���� �ڵ尡 �������̽� �޼ҵ带 ȣ���ϸ� �������̽��� ��ü�� �޼ҵ带 ȣ���Ѵ�.
 * ��ü�� �������̽����� ���ǵ� �߻� �޼ҵ�� ������ �޼ҵ��̸�, �Ű� Ÿ��, ����Ÿ���� ���� ��ü �޼ҵ带 ������ �־�� �Ѵ�.
 * �̷��� ��ü�� �������̽��� ���� ��ü��� �ϰ�, ���� ��ü�� �����ϴ� Ŭ������ ���� Ŭ������� �Ѵ�.
 * 
 * ���� Ŭ������ ������ Ŭ������ �����ѵ�,�������̽� Ÿ������ ����� �� ������ �˷��ֱ� ���� Ŭ���� ����ο� implementsŰ���带 �߰��ϰ�
 * �������̽� �̸��� ����ؾ� �Ѵ�. �׸��� �������̽��� ����� �߻� �޼ҵ��� ��ü �޼ҵ带 �����ؾ� ��.
 * 
 * */




public class Television implements RemoteControl {

	private int volume;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println(" TV�� ��");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV ��");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub

		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else this.volume = volume;
		
		System.out.println("���� ����: "+  this.volume);
	}

}
