package main;

public class SampleTest {

	public static void main(String[] args) {
		Price price = ReciCalc.calcPrice("Salad Dressing");
		System.out.println(price);
		price = ReciCalc.calcPrice("Healthy Chicken Breast");
		System.out.println(price);
		price = ReciCalc.calcPrice("Pasta Fiesta");
		System.out.println(price);
	}
}
