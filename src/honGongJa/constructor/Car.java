package honGongJa.constructor;

/*������ �����ε��� ������ ��� ������ ���� �ߺ��� �ڵ尡 �߻��� �� �ִ�.
 * �ʵ��ʱ�ȭ ������ �� �����ڿ��� ���������� �ۼ��ϰ� ������ �����ڴ� �ʱ�ȭ ������ ������ �ִ�
 * �����ڸ� ȣ���ϴ� ������� ������ �� �ִ�.
 *  this()�� �ڽ��� �ٸ� �����ڸ� ȣ���ϴ� �ڵ�� �ݵ�� �������� ù �ٿ����� ���ȴ�.
 *  
*/


public class Car {

	String company = "����";
	String model;
	String color;
	int maxSpeed;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	Car(String model) {
		this(model, "silver", 250);

	}

	Car(String model, String color) {
		this(model, color, 250);
	}

	Car(String model, String color, int maxSpeed) {

		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
