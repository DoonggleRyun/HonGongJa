package honGongJa.package_and_modifier;
/*
접근제한자는 말 그대로 접근을 제한하기 위해 사용된다. 여기서 접근이란
클래스 및 인터페이스 그리고 이들이가지고 있는 멤버의 접근을 말한다

public: 단어 뜻 그대로 외부클래스가 자유롭게 사용할 수 있다.
protected: 같은 패키지 또는 자식 클래스에서 사용할 수 있다.
private: 외부에서 사용할 수 없다.
default: 같은 패키지에 소속된 클래스에서만 사용할 수 있다.클래스 선언시 public 생략하면 그 클래스는 default접근 제한을 가진다.

public> protected> default> private
*
*
*/

public class A {
	
	A a1 = new A(true);
	A a2 = new A(2);
	A a3 = new A("YES");

	public A(boolean b) { //퍼블릭 접근 제한
	}

	A(int b) {				//default접근제한
	}

	private A(String c) {	//private 접근 제한  생성자 호출 못하고, 오로지 클래스 내부에서만 생성자를 호출 하고 객체를 만들 수 있다.
	}
}
