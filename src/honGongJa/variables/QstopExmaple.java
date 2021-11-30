package honGongJa.variables;

import java.io.IOException;

public class QstopExmaple {

	public static void main(String args[]) throws IOException {
		int keyCode;
		
		while (true) {
			keyCode = System.in.read();
			System.out.println("KeyCode: "+ keyCode);
			
			if(keyCode == 113) {
				break;
			}
		}
		System.out.println("Á¾·á");
	}
}
