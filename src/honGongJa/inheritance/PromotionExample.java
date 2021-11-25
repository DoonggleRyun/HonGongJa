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


//�ڵ�Ÿ�Ժ�ȯ�� �� �ʿ��Ѱɱ�?
//�׳� �ڽ� Ÿ������ ����ϸ� �� ���� �θ� Ÿ������ ��ȯ�ؼ� ����ϴ� ������ ����? �װ��� �������� �����ϱ� ���ؼ���.
// �ڵ����� �����ϴ� ��ǰ�� �������� ��ü�� �� �ִ�. ���������� ��ü�鵵 �ٸ� ��ü�� ��ü�� �� �־�� ��.