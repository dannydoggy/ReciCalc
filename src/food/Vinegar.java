package food;

public class Vinegar extends Pantry implements Food {

	@Override
	public double getPrice() {
		return 1.26;
	}

	@Override
	public double getDiscount() {
		return 0;
	}

}
