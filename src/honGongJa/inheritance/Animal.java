package honGongJa.inheritance;

/*�߻�Ŭ������ ���� Ŭ������ ���������� ������ �� �ʵ�� �޼ҵ���� �����س��� �߻����� Ŭ������, ��ü Ŭ������ ����� �����ϴ� �� ������ �ִ�
 *��� ��ü���� ������ �ִ� �޼ҵ��� ���� ������ �����ϴٸ� �߻� Ŭ������ �޼ҵ带 �ۼ��ϴ� ���� ���� ���̴�.
 *
 *������ ������ ���� �����ϰ�, ���� ������ ��ü Ŭ�������� �޶����� �ϴ� ��찡 �ִ�. ���� ���, ��� ������ �Ҹ��� ���� ������ AnimalŬ������ sound()��� �޼ҵ带 ����
 *�ߴٰ� ��������. �߻�޼ҵ�� abstract Ű����� �Բ� �޼ҵ��� ����θ� �ְ� �޼ҵ� ���� ������ �߰�ȣ{}�� ���� �޼ҵ带 ���Ѵ�.
 *
 *
 *�߻� Ŭ���� ���� �� ���� Ŭ������ �ݵ�� ���� ������ ä�쵵�� �����ϰ� ���� �޼ҵ尡 ���� ��� �ش� �޼ҵ带 �߻� �޼ҵ�� �����Ѵ�.
 * �ڽ� Ŭ������ �ݵ�� �߻� �޼ҵ带 �������ؼ� ���� ������ �ۼ��ؾ� �ϴµ�, �׷��� ������ ������ ������ ����.
 *
*/
public abstract class Animal {
	public String kind;
	
	public void breath() {
		System.out.println("���� ����.");
	}
	
	public abstract void sound(); //�߻�޼ҵ�

}