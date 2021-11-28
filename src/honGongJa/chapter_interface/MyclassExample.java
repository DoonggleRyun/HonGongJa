package honGongJa.chapter_interface;

public class MyclassExample {

	public static void main (String args[]) {
		System.out.println("1");
		Myclass mc1 = new Myclass();
		mc1.rc.turnOn();
		mc1.rc.setVolume(7);
		System.out.println(2);
		Myclass mc2 = new Myclass(new Audio());
		System.out.println(3);
		Myclass mc3 = new Myclass();
		mc3.methodA();
		System.out.println(4);
		Myclass mc4 = new Myclass();
		mc4.methodB(new Television());
	}
}

/*
 * 정리
 * 인터페이싀: 객체의 사용 방법을 정의한 타입. 개발 코드와 객체가 서로 통신하는 접점 역할을 함. 개발 코드가 인터페이스의 메소드를 호출하면,
 * 인터페이스는 객체의 메소드를 호출시킨다. 구성멤버는 상수필드와 추상 메소드다.
 * 상수필드: public static final임. 선언시 초기값 대입해야함.
 * 추상메소드:public abstract가 생략됨. 구현 클래스는 반드시 추상메소드를 재정의 해야함.
 * 
 */