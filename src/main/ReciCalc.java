package main;

import java.util.List;
import food.FoodType;;

public class ReciCalc {
	public static Price calcPrice(String name) {
		double saleTax = 0;
		double discount = 0;
		double total = 0;
		List<Contain> contains = Recipet.getContains(name);
		if (contains != null) {
			for (Contain contain : contains) {
				total += contain.getNumber() *  contain.getFood().getPrice();
				saleTax += contain.getNumber() * contain.getFood().getPrice()
						* ((FoodType) contain.getFood()).getTax();
				discount += contain.getNumber() * contain.getFood().getPrice()
						* contain.getFood().getDiscount();
			}
		}
		return new Price(name, saleTax, discount, total);
	}
}
