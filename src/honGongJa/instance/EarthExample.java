package honGongJa.instance;

public class EarthExample {

	
	public static void main(String args[]){
		Earth e = new Earth();
		System.out.println("지구의 반지름: "+ Earth.EARH_RADIUS);
		System.out.println(e.EARH_RADIUS);
		
		
	}
}




/*
 * 7가지 키워드로 끝내는 핵심포인트
 * 인스턴스 멤버 : 인스턴스멤버란 객체를 생성한 후 사용할 수 있는 필드와 메소드를 말하는데, 이들을 각각 인스턴스 필드, 인스턴스 메소드라고 부른다.
 * 
 * This: 객체 내부에서도 인스턴스 멤버에 접근하기 위해 this를 사용할 수 있다. 
 * 예를 들어 this.model은 자신이 가지고 있는 model필드라는 뜻이다.
 * this는 주로 생성자와 메소드의 매개 변수 이름이 필드와 동일한 경우, 인스턴스 멤버인 필드임을 명시하고자 할 때 사용된다.
 * 
 * 정적멤버: 클래스에 고정된 멤버로서 객체를 생성하지 않고 사용할 수 있는 필드와 메소드를 말한다. 이들을 각각 정적필드, 정적 메소드라고 한다.(클래스명으로 호출가능)
 * 
 * static: 정적 멤버를 선언할 때 사용 하는 키워드다.
 * 
 * 싱글톤: 전체 프로그램에서 단 하나의 객체만 만들도록 보장해야 하는 경우가 있다. 단 하나만 생성된다고 해서 이 객체를 싱글톤이라고 한다.(new연산자로 호출안하고 getinstance메소드를 만들어 호출한다.)
 * 
 * final필드: 초기값이 저장되면 이것이 최종적인 값이 돼서 프로그램 실행 도중에 수정할 수 없는 필드를 말한다. final 필드는 final키워드로 선언한다.
 * 
 */