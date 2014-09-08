package food;

public class Pepper extends Pantry implements Food {

	@Override
	public double getPrice() {
		return 0.17;
	}

	@Override
	public double getDiscount() {
		return 0;
	}

}
