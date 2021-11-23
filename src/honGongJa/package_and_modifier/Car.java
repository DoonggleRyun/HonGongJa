package honGongJa.package_and_modifier;

/* �Ϲ������� ��ü ���� ���α׷��ֿ����� ��ü�� �ʵ带 ��ü �ܺο��� ���������� �����ϴ� ���� ���´�
 * �� ������ �ܺο��� ������� ������ ��� ��ü�� ���Ἲ�� ���� �� �ֱ� �����̴�. ���� ��� �ڵ����� �ӵ��� ������ �� �� ���µ�, 
 * �ܺο��� ������ �����ϸ� ��ü�� ���Ἲ�� ������.
 * �̷��� �������� �ذ��ϱ� ���� ��ü ���� ���α׷��ֿ����� �޼ҵ带 ���ؼ� �ʵ带 �����ϴ� ����� ��ȣ�Ѵ�.
 * �ʵ�� �ܺο��� ������ �� ������ ����, �޼ҵ�� �����ؼ� �ܺο��� �޼ҵ带 ���� �ʵ忡 �����ϵ��� �����Ѵ�.
 * �� ������ �޼ҵ�� �Ű����� �����ؼ� ��ȿ�� ���� ��ü�� �ʵ�� ������ �� �ֱ� �����̴� ( ��ǥ ����)
 * �׷� ������ �ϴ� �� setter��.
 * 
 * 
 * Ŭ������ ������ �� �����ϴٸ� �ʵ带 private�� �����ؼ� �ܺηκ��� ��ȣ�ϰ�, �ʵ忡 ���� setter�� getter�޼ҵ带 �ۼ��ؼ�
 * �ʵ尪�� �����ϰ� ����/����ϴ� ���� ����.
 * 
*/

public class Car {

	private int speed;
	private boolean stop;

	// ������

	// �޼ҵ�
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}

	public boolean isstop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}

}
