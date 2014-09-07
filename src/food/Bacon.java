package food;

public class Bacon implements Food {

	@Override
	public double getPrice() {
		return 0.24;
	}

	@Override
	public double getDiscount() {
		return 0;
	}

}
