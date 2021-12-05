package honGongJa.generic;

public class Powder extends Material {

	
	private String pepper;

	public String getPepper() {
		return pepper;
	}

	public void setPepper(String pepper) {
		this.pepper = pepper;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "재료는 파우더 입니다.";
	}
	
}
