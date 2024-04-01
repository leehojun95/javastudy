package chapter14.genetics2;

public class GenericPrinterTest {

	public static void main(String[] args) {
		// 제네릭 클래스를 사용. 객체생성
		//1)Power클래스 사용가능
		GenericPrinter<Power> powerPrinter = new GenericPrinter<Power>();
		powerPrinter.setMaterial(new Power());
		Power power = powerPrinter.getMaterial();
		System.out.println(powerPrinter);
		
		//2)Plastic클래스 사용가능
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		
		//3)Material클래스 사용가능
		GenericPrinter<Material> materPrinter = new GenericPrinter<Material>();
		
		//3)Person클래스 사용가능
		GenericPrinter<Person> personPrinter = new GenericPrinter<Person>();
	}

}
