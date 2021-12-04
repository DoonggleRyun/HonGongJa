package honGongJa.Else;

public class ClassTest {

	public static void main(String[] args) {
		/**
		 * String str = new String("abc"); Class c = str.getClass();// getClass의 반환형은
		 * class Class cc = String.class; try { Class ccc =
		 * Class.forName("java.lang.String"); } catch (ClassNotFoundException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 **/

		Person person = new Person();
		Class pClass = person.getClass();// Object의 클래스인 getClass

		System.out.println(pClass.getName());
		Class pClass2 = Person.class;

		try {
			
			Class pclass3 = Class.forName("honGongJa.Else.Person");
			// 동적로딩. 컴파일 시간이 아니라 실행시간에 동적으로 특정 클래스의정보를 객체화를 통해
			// 분석 및 추출 해내는 기법_
			System.out.println(pclass3);
			System.out.println(pclass3.getName());
//			Class pclass4 = Class.forName("Person");
//			System.out.println(pclass4);
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	}
}
