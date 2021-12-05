package honGongJa.generic;

public class ThreeDPrinter<T extends Material> {

	private T material;

	public T getMaterial() {
		return this.material;
	}

	public void setMaterial(T object) {
		this.material = object;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		return material.toString();
	}
}
