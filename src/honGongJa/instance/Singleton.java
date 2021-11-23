package honGongJa.instance;

/*
 * 
전체 프로그램에서 단 하나이 객체만 만들도록 보장해야 하는 경우가 있다.
단 하나만 생성된다고 해서 이 객체를 싱글톤이라고 한다.

싱글톤을 만들려면 클래스 외부에서 new 연산자로 생성자를 호출할 수 없도록 막아야 한다.(생성자를 호출한 만큼 객체가 생성되기 때문이다)
생성자를 외부에서 호출할 수 없도록 하려면 생성자 앞에 private접근 제한자를 붙여주면 된다.

1. 자신의 타입인 정적 필드를 하나 선언하고 new연산자로 객체를 생성해 초기화 한다.
2. 생성자를 외부에서 호출할 수 없도록 private접근 제한자를 붙인 생성자를 만든다.
3. 외부에서 호출할 수 있는 정적 메소드인 getInstance()를 선언하고 정적 필드에서 참고 하고 있는 자신의 객체를 리턴한다.

public class 클래스{

	private static 클래스 singleton = new 클래스 ();
	
	// 생성자
	private 클래스(){}
	
	static 클래스 getInstance(){
		return singleton;
	}

}

*
*/

public class Singleton {

	private static Singleton singleton = new Singleton(); // 자신 타입의 정적필드
	
	private Singleton() {} // private 제한자 붙인 생성자
	
	
	static Singleton getinstance() { //외부에서 호출할 수 있는 유일한 수단. 
		return singleton; 
	}
	
}
