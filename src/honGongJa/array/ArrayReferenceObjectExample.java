package honGongJa.array;

import java.util.Iterator;

public class ArrayReferenceObjectExample {
	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "java";
		strArray[1] = "java";
		strArray[2] = new String("java");
		for (String string : strArray) {
			System.out.println(string);
		}
		System.out.println( strArray[0] == strArray[1]);

		System.out.println( strArray[0] != strArray[2]);

		System.out.println( strArray[0].equals(strArray[2]));
	}
}
