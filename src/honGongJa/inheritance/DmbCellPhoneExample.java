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
	 * ��� ��ü�� Ŭ������ �����ڸ� ȣ���ؾ߸� �����ȴ�. 
	 * �θ� ��ü�� ���� �����ǰ� �ڽİ�ü�� �� �������� �����ǰŵ� 
	 * �θ� �����ڴ� �ڽ� �������� �� ù�ٿ��� ȣ��ȴ�.
	 * super();
	 * ���۰� �θ��� �⺻ �����ڸ� ȣ����. 
	 * 	 */
}
