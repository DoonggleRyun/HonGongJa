package honGongJa.instance;

public class SingletonExample {

	public static void main(String args[]) {
		
		Singleton obj1 = Singleton.getinstance();
		Singleton obj2 = Singleton.getinstance();	
		
		if(obj1 == obj2 ) {
			System.out.println("���� ��ü��");
		} else System.out.println("�ٸ�");
			
	}	

}
