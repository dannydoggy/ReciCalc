package food;

public class Corn extends Produce implements Food {

	@Override
	public double getPrice() {
		return 0.87;
	}

	@Override
	public double getDiscount() {
		return 0;
	}

}
