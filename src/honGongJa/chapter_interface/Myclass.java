package honGongJa.chapter_interface;

//���� ��ü�� �������̽� ������ ���Եȴٴ� ���� �˾�����, ���ݺ��� �������̽��� ���� ��ü�� ����ϴ� ����� �˾ƺ��ڴ�.
public class Myclass {

	
	
	RemoteControl rc = new Television();
	//�������̽��� �ʵ� Ÿ������ ���� ���, �ʵ忡 ���� ��ü�� ������ �� �ִ�.
	
	Myclass(){
		
	}
	 
	Myclass(RemoteControl rc) {
		// TODO Auto-generated constructor stub
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	// �������̽��� �������� �Ű� ���� Ÿ������ ���ɰ��, new �����ڷ� ��ü�� ������ �� ���� ��ü�� �������� �Ű������� ���� �� �� �ִ�.
	
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	// �������̽��� ���� ���� Ÿ������ ���� ���, ������ ���� ��ü�� ������ �� �ִ�.
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
	//�������̽��� �޼ҵ��� �Ű� ���� Ÿ������ ���� ���, �޼ҵ� ȣ�� �� ���� ��ü�� �Ű������� ������ �� �ֵ�.
	
	
}
