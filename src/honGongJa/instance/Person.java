package honGongJa.instance;
/*

final�ʵ�� �ʱⰪ�� ����Ǹ� �̰��� �������� ���� �ż� ���α׷� ���� ���߿� ������ �� ����.

final �ʱⰪ �ִ� ���
1. �ʵ� ����ÿ� �ֱ�
2. �����ڿ��� �ֱ�. �����ڴ� final������ �����ʱ�ȭ�� ���ľ� �ϴµ� ���� �ʱ�ȭ ���� ���� final �ʵ带 �״�� ���ܵθ� ������ ������ �߻��Ѵ�.

*
*/

public class Person {
	
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

}
