package main;

public class Price {
	private double saleTax;
	private double wellnessDiscount;
	private double total;
	private String name;
	
	public Price(String name, double saleTax, double wellnessDiscount, double total) {
		this.name = name;
		this.saleTax = saleTax;
		this.wellnessDiscount = wellnessDiscount;
		this.total = total;
	}
	
	private double roundTax() {
		long tax = Math.round(Math.ceil(saleTax * 100));
		if (tax % 7 != 0) {
			return ((tax/7 + 1) * 7) / 100.0;
		}
		return tax / 100.0;
	}
	
	private double totalCost() {
		return Math.round(Math.ceil((total + roundTax() - roundDiscount()) * 100))/ 100.0;
	} 
	
	public double roundDiscount() {
		long count = Math.round(Math.ceil(wellnessDiscount * 100));
		return count / 100.0;
	}
	public String toString() {
		return "The Price of " + name +
				"\nSales Tax: $"+Double.toString(roundTax()) +
				"\nWellness Discount: $" +
				Double.toString(roundDiscount()) + 
				"\nTotal Cost: $" + Double.toString(totalCost()) + "\n";
	}
}
