package honGongJa.generic;

public class ThreeDPrinterTest {

	public static void main(String[] args) {

		ThreeDPrinter<Powder> printer = new ThreeDPrinter<Powder>();
		printer.setMaterial(new Powder());
		Powder powder = printer.getMaterial();
		
		System.out.println(printer);
		
		ThreeDPrinter<Plastic> plasticPrinter = new ThreeDPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
	}
}
