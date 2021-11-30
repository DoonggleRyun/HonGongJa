package honGongJa.nestedClass;

/*
객체 지향 프로그래밍에서 클래스들은 서로 긴밀한 관계를 맺고 상호작용 한다.abstract어떤 클래스는 여러 클래스와 관계를 맺지만
어떤 클래스는 특정 클래스와 관계를 맺는다. 특정 클래스와 관계를 맺는 경우에는 클래스 내부에 선언하는 것이 좋다.*/


/*
중첩클래스는 선언되는 위치에 따라 1. 멤버클래스, 2.로컬 클래스 이 두 가지로 분류 된
- 클래스의 멤버로서 선언되는 중첩 클래스를 멤버 클래스라고 하고, 멤버 클래스는  클래스나 객체가 사용 중이라면 언제든지 재사용이 가능
   = 인스턴스 멤버 클래스, 정적 멤버 클래스
- 생성자 또는 메소드 내부에서 선언되는 중첩크래스를 로컬클래스. 메소드를 실행할 떄만 사용되고 종료되면 없어짐.
로컬 클래스는 접근 제한자 및 static을 붙일 수 없음. 로컬 클래스는 메소드 내부에서만 사용되므로 접근을 제한할 필요가 없음/

- 중첩클래스도 하나의 클래스이기 때문에 컴파일 하면 바이트 코드 파일이 별도로 생성됨.(.class) (ex/ A$B.class)

인스턴스 멤버 크래스는 static 키워드 없이 중첩 선언된 클래스를 말함.
인스턴스 멤버 클래스는 인스턴스 필드와 메소드만 선언이 가능하고 정적 필드와 메소드는 선언할 수 없음.

정적 멤버 클래스는 static 키워드로 선언된 클래스를 말함. 정적 멤버 클래스는 모든 종류의 필드와 메소드를 선언 할 수 있음/


*/
public class A {

	A(){
		System.out.println("A 객체 생성됨");
	}
	
	//인스턴스 멤버 클래스
	class B{
		B(){
			System.out.println("B 객체 생성됨.");
		}
		int field1;
		void method1() {}
	}
	
	//정적 멤버 클래스
	static class C{
		public C() {
			// TODO Auto-generated constructor stub
		System.out.println("C 생성됨");
		}
		
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		//로컬 클래스
		class D{
			public D() {
				// TODO Auto-generated constructor stub
			System.out.println("D 객체가 생성됨");
			}
			int field1;
			void method1() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
