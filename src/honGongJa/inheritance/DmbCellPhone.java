package honGongJa.inheritance;



public class DmbCellPhone  extends CellPhone{
	
	/*
	 * super();
	 */
	int channel;
	
	public DmbCellPhone(String model, String color, int channel) {
		this.model = model; //�θ�Ŭ������ �ִ� �ʵ���
		this.color = color;//�θ�Ŭ������ �ִ� �ʵ���
		this.channel = channel;
		
	}
	
	
	void turnOnDmb() {
		System.out.println("ä�� "+ channel + "�� Dmb ��� ������ �����Ѵ�.");
	}
	
	void changeChannelDmb(int channel) {
	this.channel = channel;
	System.out.println("ä�� " + channel+"������ �ٲ۴�.");
	}
	
	void turnOffDmb() {
		System.out.println("Dmb ��� ������ �����.");
	}
}
