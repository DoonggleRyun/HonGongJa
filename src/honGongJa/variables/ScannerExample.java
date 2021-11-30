package honGongJa.variables;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputData;
		while (true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열은: \n"+inputData);
			if(inputData.equals("q")) {
				System.out.println("반복문 종료"); 
				break;
			}
		}
	
		
	}
	
}
