package honGongJa.constructor;

/*생성자 오버로딩이 많아질 경우 생성자 간의 중복된 코드가 발생할 수 있다.
 * 필드초기화 내용은 한 생성자에만 집중적으로 작성하고 나머지 생성자는 초기화 내용을 가지고 있는
 * 생성자를 호출하는 방법으로 개선할 수 있다.
 *  this()는 자신의 다른 생성자를 호출하는 코드로 반드시 생성자의 첫 줄에서만 허용된다.
 *  
*/


public class Car {

	String company = "현차";
	String model;
	String color;
	int maxSpeed;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	Car(String model) {
		this(model, "silver", 250);

	}

	Car(String model, String color) {
		this(model, color, 250);
	}

	Car(String model, String color, int maxSpeed) {

		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
