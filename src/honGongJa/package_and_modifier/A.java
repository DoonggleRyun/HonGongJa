package honGongJa.package_and_modifier;
/*
���������ڴ� �� �״�� ������ �����ϱ� ���� ���ȴ�. ���⼭ �����̶�
Ŭ���� �� �������̽� �׸��� �̵��̰����� �ִ� ����� ������ ���Ѵ�

public: �ܾ� �� �״�� �ܺ�Ŭ������ �����Ӱ� ����� �� �ִ�.
protected: ���� ��Ű�� �Ǵ� �ڽ� Ŭ�������� ����� �� �ִ�.
private: �ܺο��� ����� �� ����.
default: ���� ��Ű���� �Ҽӵ� Ŭ���������� ����� �� �ִ�.Ŭ���� ����� public �����ϸ� �� Ŭ������ default���� ������ ������.

public> protected> default> private
*
*
*/

public class A {
	
	A a1 = new A(true);
	A a2 = new A(2);
	A a3 = new A("YES");

	public A(boolean b) { //�ۺ� ���� ����
	}

	A(int b) {				//default��������
	}

	private A(String c) {	//private ���� ����  ������ ȣ�� ���ϰ�, ������ Ŭ���� ���ο����� �����ڸ� ȣ�� �ϰ� ��ü�� ���� �� �ִ�.
	}
}
