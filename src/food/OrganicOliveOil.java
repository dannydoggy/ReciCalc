package food;

public class OrganicOliveOil extends Pantry implements Food {

	@Override
	public double getPrice() {
		return 1.92;
	}

	@Override
	public double getDiscount() {
		return 0.05;
	}

}
