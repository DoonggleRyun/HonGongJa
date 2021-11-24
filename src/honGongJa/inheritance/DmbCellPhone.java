package honGongJa.inheritance;



public class DmbCellPhone  extends CellPhone{
	
	/*
	 * super();
	 */
	int channel;
	
	public DmbCellPhone(String model, String color, int channel) {
		this.model = model; //부모클래스에 있던 필드임
		this.color = color;//부모클래스에 있던 필드임
		this.channel = channel;
		
	}
	
	
	void turnOnDmb() {
		System.out.println("채널 "+ channel + "번 Dmb 방송 수신을 시작한다.");
	}
	
	void changeChannelDmb(int channel) {
	this.channel = channel;
	System.out.println("채널 " + channel+"번으로 바꾼다.");
	}
	
	void turnOffDmb() {
		System.out.println("Dmb 방송 수신을 멈춘다.");
	}
}
