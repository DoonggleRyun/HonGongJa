package honGongJa.chapter_interface;

public class MyclassExample {

	public static void main (String args[]) {
		System.out.println("1");
		Myclass mc1 = new Myclass();
		mc1.rc.turnOn();
		mc1.rc.setVolume(7);
		System.out.println(2);
		Myclass mc2 = new Myclass(new Audio());
		System.out.println(3);
		Myclass mc3 = new Myclass();
		mc3.methodA();
		System.out.println(4);
		Myclass mc4 = new Myclass();
		mc4.methodB(new Television());
	}
}

/*
 * ����
 * �������̚�: ��ü�� ��� ����� ������ Ÿ��. ���� �ڵ�� ��ü�� ���� ����ϴ� ���� ������ ��. ���� �ڵ尡 �������̽��� �޼ҵ带 ȣ���ϸ�,
 * �������̽��� ��ü�� �޼ҵ带 ȣ���Ų��. ��������� ����ʵ�� �߻� �޼ҵ��.
 * ����ʵ�: public static final��. ����� �ʱⰪ �����ؾ���.
 * �߻�޼ҵ�:public abstract�� ������. ���� Ŭ������ �ݵ�� �߻�޼ҵ带 ������ �ؾ���.
 * 
 */