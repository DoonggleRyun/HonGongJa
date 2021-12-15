package honGongJa.generic;

public class GenericPrinter<T extends Material> {

	private T material;

	public void setMaterial(T material) {
		this.material = material;
	}

	/*
	 * public void print() { material. }
	 */

	public T getMaterial() {
		return material;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
