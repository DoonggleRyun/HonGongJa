package honGongJa.array;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		 for (int i = 0; i < newIntArray.length; i++) {
		System.out.println(newIntArray[i]+",");	
		}
	}
}


/*
 * 배열: 같은 타입의 데이터를 연속된 공간에 나열하고, 각 데이터에 인덱스를 부여해 놓은 자료 구조이다. 인덱스: 배열 항목에 붙인 번호를
 * 말함.
 */