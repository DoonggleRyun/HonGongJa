package honGongJa.inheritance;

/*
����� �̹� �� ���ߵ� Ŭ������ �����ؼ� ���ο� Ŭ������ ����� ������ �ߺ��Ǵ� �ڵ带 �ٿ� �ش�.
����:
class �ڽ�Ŭ���� extends �θ�Ŭ����{
 �ʵ�
 + ������
 + �޼ҵ�
}

�翬�� �������(ó�� ���� ��� ���忡�� �� �翬�� �� �� �ְ�����)
1.�ڽ��� �������� �θ�Ŭ������ ����� �� �� ����. �ڹٴ� ���� ����� ������� �ʾ� �������� �θ�Ŭ������ ����� �� ���ٰ� �����ִµ�, �׷� �������� �θ�Ŭ������ ����� �� �ִ� �� �ִ°ɱ�? ȣȣ.
2. �θ� Ŭ�������� private ���� ������ ���� �ʵ�� �޼ҵ�� ��� ��󿡼� ���ܵȴ�. 
3. �θ�Ŭ������ �ڽ� Ŭ������ �ٸ� ��Ű���� �����Ѵٸ� default ���� ������ ���� �ʵ�� �޼ҵ嵵 ��Ӵ�󿡼� ���ܵȴ�.

���� 2,3 ���� ���������� ������� �翬���� �� �� �ִ� ����.

*
*/
public class CellPhone {
	String model;
	String color;
	
	//������
	
	void powerOn() {
		System.out.println("powerOn");
	}// default �޼ҵ���
	
	void powerOff() {
		System.out.println("powerOff");
	}// default �޼ҵ���
	
	void bell(){
		System.out.println("Ring Ring~~~~");
	}
	
	void sendVoice(String message) {
		System.out.println("me: " + message);
	}
	
	void receiveVoice(String message) {
		System.out.println("you: " + message);
	}
	void hangUp() {
		System.out.println("hang up");
	}
}
