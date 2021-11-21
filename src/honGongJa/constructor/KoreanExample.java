package honGongJa.constructor;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("오잉또잉", "010 1234 5678");
		System.out.println("k1.name, "+ k1.name);
		System.out.println("k1.name, "+ k1.ssn);

		Korean k2 = new Korean("띠용떄용", "1234777");
		System.out.println("k2.name, "+ k2.name);
		System.out.println("k2.ssn, "+ k2.ssn);
		
		/*매개변수의 이름은 가급적이면 초기화시킬 필드와 비슷하거나 동일한 이름을 사용하는것이 좋은데,
		 * 위의 경우 필드와 매개변수 이름이동일하기 떄문에 생성자 내부에서 해당필드에 접근할 수 없다.
		 * 왜냐하면 동일한 이르므이 매개변수가 사용 우선순위가 높기 떄문이다
		 * 해결 방법은 필드 앞에 this를 붙이면 된다. this는 객체 자신의 참조인데,
		 * 우리가 우리자신을 나라고 하듯이 객체가 객체 자신을 this라고 한다. 
		 * therefore,this를 이용하여 Korean 생성자를 수정하면 아래와 같다. */
		
		
//		public Korean(String name, String ssn) {
//			this.name = name;
//			this.ssn = ssn;
//		
//		}
		
		//생성자 오버로딩 - 매개변수를 달리하는 생성자를 여러개 선언하는 것

	}
}
