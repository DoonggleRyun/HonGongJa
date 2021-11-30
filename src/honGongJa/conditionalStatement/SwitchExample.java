package honGongJa.conditionalStatement;

public class SwitchExample {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6) +1;
		switch (num) {
		case 1:
			System.out.println("7");
			break;
		case 2:
			System.out.println("5");
			break;
		case 5:
			System.out.println("3");
			break;
		default:
			System.out.println("dd");
			break;
		}
	}
}
