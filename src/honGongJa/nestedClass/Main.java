package honGongJa.nestedClass;

public class Main {

	
	public static void main(String[] args) {
		
		double dV = 3.14;
		int intV = (int)dV;
		System.out.println(intV);
		A a = new A();
		System.out.println("\"����ǥ\"\n����ϰ��� ");
		//�ν��Ͻ� ��� Ŭ���� ��ü ����
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		//���� ��� Ŭ���� ��ü ����
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 =3;
		A.C.method2();
		
		//���� Ŭ���� ��ü ������ ���� �޼ҵ� ȣ��
		a.method();
		
		
		System.out.printf("�̸�: %s", "�ý���");

		System.out.printf("�̸��� %1s, ����: %2d", "�ڹ�", 30);
		System.out.printf("��ǰ�� ����:  %1$06d ��\n, �׽�Ʈ: %2$s \t", 123,"�л�");
		
	}
}
