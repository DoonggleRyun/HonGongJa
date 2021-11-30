package honGongJa.nestedClass;

public class Main {

	
	public static void main(String[] args) {
		
		double dV = 3.14;
		int intV = (int)dV;
		System.out.println(intV);
		A a = new A();
		System.out.println("\"따옴표\"\n사용하고파 ");
		//인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		//정적 멤버 클래스 객체 생성
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 =3;
		A.C.method2();
		
		//로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
		
		
		System.out.printf("이름: %s", "시스템");

		System.out.printf("이르미 %1s, 나이: %2d", "자바", 30);
		System.out.printf("상품의 가격:  %1$06d 원\n, 테스트: %2$s \t", 123,"뿅뿅");
		
	}
}
