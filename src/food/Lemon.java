package food;

public class Lemon implements Food {

	@Override
	public double getPrice() {
		return 2.03;
	}

	@Override
	public double getDiscount() {
		return 0;
	}

}
