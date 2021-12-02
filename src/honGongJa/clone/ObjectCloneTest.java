package honGongJa.clone;

class Point {
	int x;
	int y;

	public Point(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "x= " + x + ", y =" + y;
	}
}

class Circle implements Cloneable {
	Point point;
	private int radius;

	public Circle(int x, int y, int radius) {
		// TODO Auto-generated constructor stub

		point = new Point(x, y);
		this.radius = radius;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "¿øÁ¡Àº: " + point.toString();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class ObjectCloneTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Circle circle = new Circle(10, 20, 5);
		Circle clonedCicle = (Circle) circle.clone();
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(clonedCicle));
	}
}
