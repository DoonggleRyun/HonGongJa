package honGongJa.nestedClass;

public class ButtonExample {

	public static void main(String[] args) {
		Button button = new Button();
		button.setOnclickListener(new CallListener());
		button.touch();
		
		button.setOnclickListener(new MessageListener());
		button.touch();
	}
	
}
