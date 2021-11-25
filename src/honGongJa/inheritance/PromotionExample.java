package honGongJa.inheritance;


class A{}
class B extends A{}
class C extends A{}

class D extends B{}
class E extends C{}

public class PromotionExample {

	public static void main(String[] args) {
		
		B b = new B();
		System.out.println(b);
		C c = new C();
		System.out.println(c);
		D d = new D();
		System.out.println(d);
		E e = new E();
		System.out.println(e);
		
		A a1 = b;
		System.out.println(a1);
		A a2 = c;
		System.out.println(a2);
		A a3 = d;
		System.out.println(a3);
		A a4 = e;
		System.out.println(a4);
		
		
	}
}


//자동타입변환은 왜 필요한걸까?
//그냥 자식 타입으로 사용하면 될 것을 부모 타입으로 변환해서 사용하는 이유가 뭘까? 그것은 다형성을 구현하기 위해서다.
// 자동차를 구성하는 부품은 언제든지 교체할 수 있다. 마찬가지로 객체들도 다른 객체로 교체될 수 있어야 함.