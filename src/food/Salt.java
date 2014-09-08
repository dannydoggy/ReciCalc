package food;

public class Salt extends Pantry implements Food {

	@Override
	public double getPrice() {
		return 0.16;
	}

	@Override
	public double getDiscount() {
		return 0;
	}

}
