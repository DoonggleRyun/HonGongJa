package honGongJa.constructor;
/*
�����ڴ� new�����ڷ� Ŭ�����κ��� ��ü�� ������ �� ȣ��Ǿ� ��ü�� �ʱ�ȭ�� ���.
��ü �ʱ�ȭ�� �ʵ带 �ʱ�ȭ�ϰų� �޼ҵ带 ȣ���ؼ� ��ü�� ����� �غ� �ϴ� ���� ���Ѵ�.
�����ڸ� �����ϵ� �ʰ��� Ŭ�����κ��� ��ü�� ���� �� ����. new�����ڿ� ���� �����ڰ� ���������� ����Ǹ� 
heap������ ��ü�� �����ǰ� ��ü�� �ּҰ� ���ϵȴ�. ���ϵ� ��ü�� �ּҴ� Ŭ���� ������ ����ȴ�.


�⺻������
��� Ŭ������ �����ڰ� �ݵ�� �����ϸ�, �����ڸ� �ϳ� �̻� ���� �� �ִ�. �츮�� Ŭ���� ���ο� ������ ������ �����ߴٸ� 
�����Ϸ��� �⺻�����ڸ� ����Ʈ �ڵ忡 �ڵ� �߰��Ѵ�. Ŭ������ publicŬ������ ����Ǹ� �⺻ �����ڿ����� �ۺ����� ������,
Ŭ���� �ۺ��� ���� Ŭ�����θ� ����Ǹ� �⺻ �����ڿ��� �ۺ����� ���� �ʴ´�.


�����ڴ� �޼ҵ�� ����� ����� ���� ������, ����Ÿ���� ���� Ŭ���� �̸��� �����ϴ�.

�ʵ��ʱ�ȭ
Ŭ�����κ��� ��ü�� ������ �� �ʵ�� �⺻ �ʱⰪ���� �����ȴ�.
���� �ٸ� ������ �ʱ�ȭ �ϰ� �ʹٸ� �� ���� ����� �ִ�.
�ϳ��� �ʵ带 ������ �� �ʱⰪ�� �ִ� ����̰�, �� �ٸ� �ϳ��� �����ڿ��� �ʱ㘳�� �ִ� ����̴�. 
�ʵ带 �����Ҷ� �ʱⰪ�� �ְԵǸ� ������ Ŭ������ ���� �����Ǵ� ��ü���� ��� ���� ���� ���� �ȴ�.


*/



public class Korean {
	String nation = "���ѹα�";
	String name;
	String ssn;

	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	
	}
}