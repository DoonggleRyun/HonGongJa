package honGongJa.variables;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputData;
		while (true) {
			inputData = scanner.nextLine();
			System.out.println("�Էµ� ���ڿ���: \n"+inputData);
			if(inputData.equals("q")) {
				System.out.println("�ݺ��� ����"); 
				break;
			}
		}
	
		
	}
	
}
