package honGongJa.Else;

public class ClassTest {

	public static void main(String[] args) {
		/**
		 * String str = new String("abc"); Class c = str.getClass();// getClass�� ��ȯ����
		 * class Class cc = String.class; try { Class ccc =
		 * Class.forName("java.lang.String"); } catch (ClassNotFoundException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 **/

		Person person = new Person();
		Class pClass = person.getClass();// Object�� Ŭ������ getClass

		System.out.println(pClass.getName());
		Class pClass2 = Person.class;

		try {
			
			Class pclass3 = Class.forName("honGongJa.Else.Person");
			// �����ε�. ������ �ð��� �ƴ϶� ����ð��� �������� Ư�� Ŭ������������ ��üȭ�� ����
			// �м� �� ���� �س��� ���_
			System.out.println(pclass3);
			System.out.println(pclass3.getName());
//			Class pclass4 = Class.forName("Person");
//			System.out.println(pclass4);
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	}
}
