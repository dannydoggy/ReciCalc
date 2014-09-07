package main;

public class Price {
	private double saleTax;
	private double wellnessDiscount;
	private double totalCost;
	
	public Price(double saleTax, double wellnessDiscount, double totalCost) {
		this.saleTax = saleTax;
		this.wellnessDiscount = wellnessDiscount;
		this.totalCost = totalCost;
	}
	
	public String toString() {
		return "Sales Tax: $"+Double.toString(saleTax) +
				"\n Wellness Discount: ($" +
				Double.toString(wellnessDiscount) + 
				")\nTotal Cost: $" + Double.toString(totalCost);
	}
}
