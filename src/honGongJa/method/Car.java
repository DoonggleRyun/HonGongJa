package honGongJa.method;

/*�޼ҵ� ������ ����ο� ���� ������� �����ȴ�. 
����Ÿ���� ���ϰ��� Ÿ���� ���Ѵ�. ���ϰ��̶� �޼ҵ带 ������ ���� �����.
�޼ҵ�� ���ϰ��� ���� ���� �ְ� ���� ���� ������ ���ϰ��� ���� ��� ���� Ÿ���� ����ο� ��õž� �մϴ�.

���� ���� ���� �޼ҵ� Void
���ϰ��� ���� �޼ҵ�� ���� Ÿ������ void�� ����Ѵ�. �׷��� void�� ����� �޼ҵ忡���� return���� ��� �� �� �ִ�.
�׸��� �װ� ���ϰ��� �����ϴ� ���� �ƴ϶� �޼ҵ� ������ ���� �����Ű�� ������ �Ѵ�.

*
*/

public class Car {

	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		
		if (gas == 0) {
			System.out.println("out of gas");
			return false;
		}
		System.out.println("we do have it");
		return true;
	}
	
	void run() {
		while (true) {
			if(gas > 0) 
			{
				System.out.println("run. gas�ܷ��� : " + gas);
				gas -= 1;
			}else {
				System.out.println("stop gas�ܷ��� : " + gas);
				return; // �޼ҵ� ��������.

			}
		}
	}
}
