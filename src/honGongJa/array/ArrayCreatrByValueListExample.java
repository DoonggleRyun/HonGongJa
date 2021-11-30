package honGongJa.array;

public class ArrayCreatrByValueListExample {

	public static void main(String args[]) {
		int[] scores = new int[] {83,90,87};
		int sum1= 0;
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
			
		}
		
		System.out.println("총합: "+sum1);
		
		int sum2 = add(new int[] {83, 90, 87});
		System.out.println("총합: "+sum2);
		
		int[] riri = new int[5];
		System.out.println(riri.length);
		
	}
	
	public static int add(int[] scores) {
		
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		
		return sum;
		
	}
}

/*
	 * 기본타입 초기값 = 0 논리타입 초기값 = false 참조타입 초기값 = null
	 */