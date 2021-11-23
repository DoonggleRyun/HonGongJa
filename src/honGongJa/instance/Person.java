package honGongJa.instance;
/*

final필드는 초기값이 저장되면 이것이 최종적인 값이 돼서 프로그램 실행 도중에 수정할 수 없다.

final 초기값 주는 방법
1. 필드 선언시에 주기
2. 생성자에서 주기. 생성자는 final변수의 최종초기화를 마쳐야 하는데 만약 초기화 되지 않은 final 필드를 그대로 남겨두면 컴파일 에러가 발생한다.

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
