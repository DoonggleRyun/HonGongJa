package honGongJa.inheritance;

/*추상클래스는 실제 클래스가 공통적으로 가져야 할 필드와 메소드들을 정의해놓은 추상적인 클래스로, 실체 클래스의 멤버를 통일하는 데 목적이 있다
 *모든 실체들이 가지고 있는 메소드의 실행 내용이 동일하다면 추상 클래스에 메소드를 작성하는 것이 좋을 것이다.
 *
 *하지만 세도의 선언만 통일하고, 실행 내용은 실체 클래스마다 달라져야 하는 경우가 있다. 에를 들어, 모든 동물은 소리를 내기 때문에 Animal클래스에 sound()라는 메소드를 정의
 *했다고 가정하자. 추상메소드는 abstract 키워드와 함께 메소드의 선언부만 있고 메소드 실행 내용인 중괄호{}가 없는 메소드를 말한다.
 *
 *
 *추상 클래스 설계 시 하위 클래스가 반드시 실행 내용을 채우도록 장제하고 싶은 메소드가 있을 경우 해당 메소드를 추상 메소드로 선언한다.
 * 자식 클래스는 반드시 추상 메소드를 재정의해서 실행 내용을 작성해야 하는데, 그렇지 않으면 컴파일 에러가 난다.
 *
*/
public abstract class Animal {
	public String kind;
	
	public void breath() {
		System.out.println("숨을 쉰다.");
	}
	
	public abstract void sound(); //추상메소드

}
