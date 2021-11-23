package honGongJa.instance;

public class PersonExample {

	public static void main(String[] args) {

		Person p1 = new Person("1234567", "½¯·¯");
		
		System.out.println(p1.nation+p1.ssn+p1.name);
		
		p1.name = "¿¡·»";
		System.out.println(p1.nation+p1.ssn+p1.name);
		
		
		
	}

}
