package honGongJa.instance;

/*
 * 
��ü ���α׷����� �� �ϳ��� ��ü�� ���鵵�� �����ؾ� �ϴ� ��찡 �ִ�.
�� �ϳ��� �����ȴٰ� �ؼ� �� ��ü�� �̱����̶�� �Ѵ�.

�̱����� ������� Ŭ���� �ܺο��� new �����ڷ� �����ڸ� ȣ���� �� ������ ���ƾ� �Ѵ�.(�����ڸ� ȣ���� ��ŭ ��ü�� �����Ǳ� �����̴�)
�����ڸ� �ܺο��� ȣ���� �� ������ �Ϸ��� ������ �տ� private���� �����ڸ� �ٿ��ָ� �ȴ�.

1. �ڽ��� Ÿ���� ���� �ʵ带 �ϳ� �����ϰ� new�����ڷ� ��ü�� ������ �ʱ�ȭ �Ѵ�.
2. �����ڸ� �ܺο��� ȣ���� �� ������ private���� �����ڸ� ���� �����ڸ� �����.
3. �ܺο��� ȣ���� �� �ִ� ���� �޼ҵ��� getInstance()�� �����ϰ� ���� �ʵ忡�� ���� �ϰ� �ִ� �ڽ��� ��ü�� �����Ѵ�.

public class Ŭ����{

	private static Ŭ���� singleton = new Ŭ���� ();
	
	// ������
	private Ŭ����(){}
	
	static Ŭ���� getInstance(){
		return singleton;
	}

}

*
*/

public class Singleton {

	private static Singleton singleton = new Singleton(); // �ڽ� Ÿ���� �����ʵ�
	
	private Singleton() {} // private ������ ���� ������
	
	
	static Singleton getinstance() { //�ܺο��� ȣ���� �� �ִ� ������ ����. 
		return singleton; 
	}
	
}
