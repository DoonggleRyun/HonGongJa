package honGongJa.inheritance;

/*
상속은 이미 잘 개발된 클래스를 재사용해서 새로운 클래스를 만들기 때문에 중복되는 코드를 줄여 준다.
문법:
class 자식클래스 extends 부모클래스{
 필드
 + 생성자
 + 메소드
}

당연한 얘기지만(처음 배우는 사람 입장에선 안 당연할 수 도 있겠지만)
1.자식이 여러개의 부모클래스를 상속할 수 는 없다. 자바는 다중 상속을 허용하지 않아 여러개의 부모클래스를 상속할 수 없다고 나와있는데, 그럼 여러개의 부모클래스를 상속할 수 있는 언어가 있는걸까? 호호.
2. 부모 클래스에서 private 접근 제한을 갖는 필드와 메소드는 상속 대상에서 제외된다. 
3. 부모클래스와 자식 클래스가 다른 패키지에 존재한다면 default 접근 제한을 갖는 필드와 메소드도 상속대상에서 제외된다.

위의 2,3 번은 접근제한자 배웠으면 당연함을 알 수 있는 내용.

*
*/
public class CellPhone {
	String model;
	String color;
	
	//생성자
	
	void powerOn() {
		System.out.println("powerOn");
	}// default 메소드임
	
	void powerOff() {
		System.out.println("powerOff");
	}// default 메소드임
	
	void bell(){
		System.out.println("Ring Ring~~~~");
	}
	
	void sendVoice(String message) {
		System.out.println("me: " + message);
	}
	
	void receiveVoice(String message) {
		System.out.println("you: " + message);
	}
	void hangUp() {
		System.out.println("hang up");
	}
}
