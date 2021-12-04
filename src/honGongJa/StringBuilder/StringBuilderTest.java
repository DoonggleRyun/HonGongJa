package honGongJa.StringBuilder;

public class StringBuilderTest {
	public static void main(String[] args) {
		String str1 = new String("java");
		System.out.println(System.identityHashCode(str1));
		
		StringBuilder buffer = new StringBuilder(str1);
		System.out.println(System.identityHashCode(buffer));
		buffer.append(" and");
		buffer.append(" android 뚱땅");
		System.out.println(System.identityHashCode(buffer));
		String str2 = buffer.toString();
		System.out.println(str2);
		
		Integer i = new Integer(100);
		//자바 9 이전에는 new로 했는데 이제는 아래와 같이 사용가능
		Integer ii = 100;
	}
}
