package honGongJa.constructor;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("���׶���", "010 1234 5678");
		System.out.println("k1.name, "+ k1.name);
		System.out.println("k1.name, "+ k1.ssn);

		Korean k2 = new Korean("��닚��", "1234777");
		System.out.println("k2.name, "+ k2.name);
		System.out.println("k2.ssn, "+ k2.ssn);
		
		/*�Ű������� �̸��� �������̸� �ʱ�ȭ��ų �ʵ�� ����ϰų� ������ �̸��� ����ϴ°��� ������,
		 * ���� ��� �ʵ�� �Ű����� �̸��̵����ϱ� ������ ������ ���ο��� �ش��ʵ忡 ������ �� ����.
		 * �ֳ��ϸ� ������ �̸����� �Ű������� ��� �켱������ ���� �����̴�
		 * �ذ� ����� �ʵ� �տ� this�� ���̸� �ȴ�. this�� ��ü �ڽ��� �����ε�,
		 * �츮�� �츮�ڽ��� ����� �ϵ��� ��ü�� ��ü �ڽ��� this��� �Ѵ�. 
		 * therefore,this�� �̿��Ͽ� Korean �����ڸ� �����ϸ� �Ʒ��� ����. */
		
		
//		public Korean(String name, String ssn) {
//			this.name = name;
//			this.ssn = ssn;
//		
//		}
		
		//������ �����ε� - �Ű������� �޸��ϴ� �����ڸ� ������ �����ϴ� ��

	}
}
