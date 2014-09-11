package main;

public class SampleTest {

	public static void main(String[] args) {
		Menu menu = new Recipet();
		ReciCalc reciCalc = new ReciCalc(menu);
		Price price = reciCalc.calcPrice("Salad Dressing");
		System.out.println(price);
		price = reciCalc.calcPrice("Healthy Chicken Breast");
		System.out.println(price);
		price = reciCalc.calcPrice("Pasta Fiesta");
		System.out.println(price);
	}
}
