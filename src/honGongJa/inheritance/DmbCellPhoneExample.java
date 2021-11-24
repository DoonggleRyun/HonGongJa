package honGongJa.inheritance;

public class DmbCellPhoneExample {

	public static void main (String args[]) {
		
		DmbCellPhone dmbCell = new DmbCellPhone("Google Pixel", "white", 7);
		
				System.out.println("model: " + dmbCell.model);
				System.out.println("color: " + dmbCell.color);
				System.out.println("channel: "+ dmbCell.channel);
				
				dmbCell.powerOn();
				dmbCell.hangUp();
				
				dmbCell.turnOffDmb();
				dmbCell.changeChannelDmb(777);
				dmbCell.turnOffDmb();
	}
	
	/*
	 * 모든 객체는 클래스의 생성자를 호출해야만 생성된다. 
	 * 부모 객체가 먼저 생성되고 자식객체가 그 다음으로 생성되거든 
	 * 부모 생상자는 자식 생성자의 맨 첫줄에서 호출된다.
	 * super();
	 * 수퍼가 부모의 기본 생성자를 호출함. 
	 * 	 */
}
